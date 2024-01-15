describe('Customers App UI', () => {
    const salesRepresentative = 'John Doe'
  
    beforeEach(() => {
      // For all tests, I'm mocking the API response.
      // The idea is just check that the frontend correctly renders what the API provides.
      cy.intercept(
        'POST',
        Cypress.env('API_URL'),
        { fixture: 'customers' }
      )
      cy.visit('/')
    })
  
    context('Welcome Screen', () => {
      it('alerts when no name is provided', () => {
        cy.get('[data-testid="submit-btn"]').click()
  
        cy.on('window:alert', alert => {
          expect(alert).to.equal('Please provide your name')
        })
      })
  
      it('directs the user to the Customer List Screen', () => {
        cy.get('[data-testid="name"]').type(salesRepresentative)
        cy.get('[data-testid="submit-btn"]').click()
  
        cy.contains(`Hi ${salesRepresentative}. It is now Wed Aug 25 2021 and here is our customer list.`)
          .should('be.visible')
        cy.contains('Click on each of them to view their contact details.')
          .should('be.visible')
        cy.get('table')
          .should('be.visible')
          .and('contain', 'Name')
          .and('contain', '# of Employees')
          .and('contain', 'Size')
          .find('tbody tr').should('have.length.gte', 1)
      })
    })
})