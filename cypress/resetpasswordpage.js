class ResetPasswordPage {
    enterNewPassword(password) {
      cy.get('#input-password').type(password);
    }
  
    confirmNewPassword(password) {
      cy.get('#input-confirm').type(password);
    }
  
    clickContinue() {
      cy.get('[type="submit"]').click();
    }
  }
  
  export default ResetPasswordPage;
  