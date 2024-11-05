# WP Dark Mode Automation Test Suite
**This automation test suite is designed to verify and configure the WP Dark Mode plugin on a WordPress site using Selenium WebDriver. The suite includes tests for plugin activation, enabling dark mode in the admin dashboard, and validating dark mode functionality.**

**Overview**
**This test suite performs the following:** <br>

1. Log in to your WordPress site.
2. Check whether the “WP Dark Mode” Plugin is Active or not.
3. If Active, navigate to the WP Dark Mode & continue. Otherwise, Install the Plugin and Activate it.
4. Enable Admin Dashboard Dark Mode from Controls → Admin Panel Dark Mode.
5. Validate whether the dark mode is working or not on the Admin Dashboard. Then navigate to the WP Dark Mode.
<br>

<h2 id="requirements">Requirements</h2>
<ul>
    <li><strong>Programming Language</strong>: Java</li>
    <li><strong>Testing Framework</strong>: TestNG</li>
    <li><strong>Automation Tool</strong>: Selenium WebDriver</li>
    <li><strong>Java Build Tool</strong>: Maven (for dependency management)</li>
    <li><strong>WebDriver</strong>: ChromeDriver (for Chrome) or GeckoDriver (for Firefox)</li>
    <li><strong>Environment Variables</strong>: <code>.env</code> file for credentials (to be managed using <code>dotenv-java</code> or a similar tool)</li>
</ul>

  
