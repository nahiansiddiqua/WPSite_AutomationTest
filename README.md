# WP Dark Mode Automation Test Suite
**This automation test suite is designed to verify and configure the WP Dark Mode plugin on a WordPress site using Selenium WebDriver. The suite includes tests for plugin activation, enabling dark mode in the admin dashboard, and validating dark mode functionality.**

**Overview**
**This test suite performs the following:** <br>

1. Log in to your WordPress site.
2. Check whether the “WP Dark Mode” Plugin is Active.
3. If Active, navigate to the WP Dark Mode & continue. Otherwise, Install the Plugin and Activate it.
4. Enable Admin Dashboard Dark Mode from Controls → Admin Panel Dark Mode.
5. Validate whether the dark mode is working on the Admin Dashboard. Then navigate to the WP Dark Mode.
<br>

<h2>Requirements</h2>
<ul>
    <li><strong>Programming Language</strong>: Java</li>
    <li><strong>Testing Framework</strong>: TestNG</li>
    <li><strong>Automation Tool</strong>: Selenium WebDriver</li>
    <li><strong>Java Build Tool</strong>: Maven (for dependency management)</li>
    <li><strong>WebDriver</strong>: ChromeDriver</li>
    <li><strong>Environment Variables</strong>: <code>.env</code> file for credentials (to be managed using <code>dotenv-java</code> or a similar tool)</li>
</ul>

<h2>Installation</h2>
<ol>
<li><strong>Clone the repository</strong>:</li>
    <pre><code>git clone https://github.com/nahiansiddiqua/WPSite_AutomationTest.git
cd woocommece</code></pre>
<li>Install dependencies:</li>
    <pre><code>mvn clean install</code></pre>
    <p>This command will download and install all required libraries for the project.</p>
</ol>

<h2>Environment Setup</h2>
<p>1. Create a <code>.env</code> file in the root directory with the following variables:</p>
<pre><code>WORDPRESS_URL=https://yourwordpresssite.com/wp-admin
USERNAME=your_admin_username
PASSWORD=your_admin_password</code></pre>
<p>Replace placeholder values with your actual WordPress admin URL, username, and password.</p>
<p>Never commit the <code>.env</code> file to the repository.</p>

<h2>Test Scenarios</h2>
<p>This test suite covers the following scenarios:</p>
<ul>
  <li><strong>Log in to WordPress</strong>: Validates login functionality to access the WordPress admin dashboard.</li>
  <li><strong>Check Plugin Status</strong>: Verifies if the WP Dark Mode plugin is active. If inactive, install and activate it.</li>
  <li><strong>Enable Admin Dashboard Dark Mode</strong>: Configures WP Dark Mode settings to enable dark mode on the admin panel.</li>
  <li><strong>Validate Dark Mode</strong>: Confirms that dark mode is applied on the admin dashboard.</li>
</ul>


  
