module.exports = (on, config) => {
    on('task', {
      getResetLink(email) {
        // Implement logic to fetch the reset link from the email
        return 'https://tutorialsninja.com/demo/reset-password-link';
      }
    });
  };
  