# Unibet Blog Automation
<p>Scenarios Automated:</p>
<ul><li>User perform search from Blog menu drawer and verify the search results</li>
<li>User perform search on search page</li>
  <li>User perform keyword search on Search page</li>
  <li>User perform invalid search on Search page</li>
</ul>
<h3>Programming Language and Automation Tools</h3>
<ul><li>Programming Language:<b>Java(jdk 1.8)</b></li>
  <li> Build Tool: Maven</li>
  <li> Selenium WebDriver: 3.141.0 </li>
  <li> Cucumber-java:1.2.5</li>
  <li>Trivago cluecumber-report-plugin:1.4.2</li>
  <li> IDE: IntelliJ IDEA 2019.1</li>
</ul>
<h3>Framework Overview</h3>
<p>The framework is based on page object design pattern and it's leveraging Cucumber BDD. The major components of the framework are:</p>
<ul><li> DriverFactory: A Singleton Class to intialize the Web Driver</li> <li> BaseClass: Contians all the reusable methods such as find element, isElementPresent, GetElementText etc..</li><li>PageObjects: Application pages containing page methods and locators</li>
  <li>CentralData.Properties: Containing device and web application specific data such as <b>App Url, Device Name, device type and version.</b></li>
</ul>
<h4> Cucumber BDD specific components:</h4>
   <ul>
  <li>Stepdefinitions: Contain step definitions of application pages.</li>
  <li>Features: Containing fetaures files</li>
  <li>TestRunner: Junit runner class</li>
  <li>Target/generated-report: Contains generated html report</li>
  </ul>
  <h3>Running Cucumber Tests:</h3>
  
  <ul>
    <li> Import the project as a maven Project in IDE such as InteliJ IDEA</li>
  <li> Start the <b>Appium Server</b>
    <li> Specify the Web App URL, AppiumServerURL, PlatformName, PlatformVersion and DeviceName  in "src/test/resources/CentralData.properties" file</li>
 <li>Run the "src/test/java/runner/CucumberTestRunner.java" class</li>
  </ul>
  <img src="https://i.ibb.co/hXfLN4k/cucumber-run.png" alt="cucumber-run" border="0">
 <h3> Cucumber Html output:</h3>
 <p> After running the tests, execute the maven goal <b> mvn cluecumber-report:reporting</b> and it will generate a HTML output report under <b>"target/generated-report"</b> folder</p>
<img src="https://i.ibb.co/d2c2V3R/r1.png" alt="r1" border="0">
<img src="https://i.ibb.co/XXv7BNB/r2.png" alt="r2" border="0">
<h4>What you would automate if you could spend more time on the project.</h4>
<p>I will automate some more funtional test-cases around Search functionality.</p>
