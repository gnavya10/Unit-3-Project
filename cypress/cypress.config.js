const { defineConfig } = require('cypress');

async function setupNodeEvents(on, config){
  return config;
  //implement node events listeners here
}

module.exports = defineConfig({
  e2e: {
    setupNodeEvents,
    specPattern: "cypress_project/pageobject/integration/resetPasswordTest.js"
  }
}

)