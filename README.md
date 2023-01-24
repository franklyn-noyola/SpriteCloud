# SpriteCloud Test Automation

# Introduction
This is my test automation project, In this project I  have validate the environment that was given (Web). In this readme file you'll find how to run those test files and also how to set Jenkins as the CI/CD tool to run those tests in a pipeline and provide the reports and results. Let's go for it.

<b>First Step</b></br>
* Install Eclipse IDE, you can download any eclipse what you like, in this case I have installed Eclipse for committers 2022. https://www.eclipse.org/downloads/
* Download Maven from maven apage page https://maven.apache.org/download.cgi. Make sure where you have installed maven. <br>
 
When you have installed both Eclipse and Maven, open Eclipse IDE and create a Maven project in Eclipse as this: <br>
 * Click on File and then click on New, then click on Project<br>
![image](https://user-images.githubusercontent.com/17472758/214378808-a624c0d6-78b9-4d5d-b9bb-cc5c06e329da.png)
* Then in the next screen, click on Maven and select Maven Project<br>
 ![image](https://user-images.githubusercontent.com/17472758/214379064-9e0af1f9-4121-4f81-8e76-7c68d6e3bdb2.png)
* Then click on Create a simple project<br>
 ![image](https://user-images.githubusercontent.com/17472758/214379478-fc24c40d-b860-4132-9dd7-c4f4d47e9fbe.png)
* Fill the Group ID, Artefact ID accordingly, it could be a name whatever you want, that is the way it is goingo to create de project in the POM properties.<br>
 ![image](https://user-images.githubusercontent.com/17472758/214379763-7da2d24d-3ecb-4e6e-9a7d-13a7d9d1f908.png)

* Once the maven project is created, go to POM.xml created and set the dependecies to of this project, that is in charge of download the corresponding library of the project, such as Selenium Framework, reporting etc.<br>
 ![image](https://user-images.githubusercontent.com/17472758/214380373-485795a8-e3d0-4c7e-8062-66b06bb9b147.png)
 * Once everything is setup, create the test scripts accordingly.
 * You can run your test cases one by one or configure/create testng.xml<br>
 ![image](https://user-images.githubusercontent.com/17472758/214382372-e90467f2-2930-409f-8eca-f87d6ff54e40.png)

 
* Once test scripts are created, uploaded into your remote repository, in this case Github. So you can download them afterwards.

Run the tests via Jenkins
First of all, you've to install Jenkins. Follow the instructions to install it depending on your OS: https://www.jenkins.io/doc/book/installing/ (I've installed Jenkins for Windows latest version).

After you followed the instructions and you are able to log in into jenkins, you should create the new pipeline where the tests will be run.

Follow the following steps:

Create a New Item and select Freestyle Project (put a name for your jenkins job)
Click on OK Button
Once you are in your Freestyle project screen
Configure the project as follow:
![image](https://user-images.githubusercontent.com/17472758/214388328-f4b392e8-c293-4835-b8cc-16639579bef8.png)



 
