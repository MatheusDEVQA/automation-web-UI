describe('Customers App API', function() {
    const salesRepresentative = 'Jonny'
    const currentTimestamp = (new Date()).toDateString()
  
    context('POST', function() {
      beforeEach(function() {
        cy.request(
          'POST',
          Cypress.env('API_URL'),
          { name: salesRepresentative }
        ).as('postRes')
      })
  
      it('returns a 200 status code', function() {
        expect(this.postRes.status).to.equal(200)
      })
    })
})