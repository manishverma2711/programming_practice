public class Assignment_composio {

    const { chromium } = require('playwright');

(async () => {
  const browser = await chromium.launch({ headless: false });
  const context = await browser.newContext();
  const page = await context.newPage();


        await page.goto('https://app.composio.dev');


        await page.click('text=Sign in with GitHub');

        // GitHub login page interaction
        await page.fill('input[name="login"]', 'vermamanish1775@gmail.com');
        await page.fill('input[name="password"]', 'Manish@1775');
        await page.click('input[name="commit"]');

        // Wait for navigation to complete
        await page.waitForNavigation();


        if (await page.$('text=Welcome')) {
            console.log('Login successful!');
        } else {
            console.log('Login failed.');
        }


        await browser.close();
    })();

}
