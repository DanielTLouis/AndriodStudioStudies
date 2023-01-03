Unit 1: Your first Andriod App
Setup Andriod Studio (Pathway 2)
* Introduction to Andriod Studio
* Download and install Andriod Studio 
  * codelab 
    * Before you begin
    * Windows: verify system requirements 
    * Windows: download and install Andriod Studio
    * Conclusion
      * Download seems straight forward 
* create your first Andriod App
  * codelab
    * watch the code-along video
      * create your first app
      * create an app from a premade templete 
      * open Andriod Studio 
        * create new project
          * select "Phone & Tablet" tab
            * select "empty compose activity" for your templete 
          * name your project "greeting card" leve all else the same 
            * use Kotlin for now 
          * clock finished 
        * at the bottom of Andriod Studio you should have a progress bar & message 
          * it is still setting up your project
          * wait till its is done 
      * In Andriod Studio click "split" to go from only seeing the code to seeing both the code & design layout
        * can clock design only
          * to only see design
        * you should see these 3 areas 
          * project view 
            * files and folders of the project 
          * code view 
            * were you edit code
          * design view 
            * were you preview what your app looks like 
            * in deisgin click "buid and refresh" to see your changes
              * should show text box saying "Hello, Andriod!" 
      * A package is a folder were code is located 
        * the file directory is made up of a structure of packages 
        * in file browser on windows the file higherarchy is set up very differently 
          * to view this way select the "Andriod" dropdown and select "project sourse files" in the project directory window
          * we use Andriod view for this course 
            * so use that to follow along   
        * we will modify the text of this App 
          * in code window 
          * the main Activity funciton works as main 
            * where Kitlin compiler starts 
            * in andriod apps the OnCreate funciton fills that file so we override main
          * Difference between regular & composed function
            1. the naming convention is different because @Composable function names are capitalized 
              * @Composable
              * fun Greedting(name:String)
            2. you add the @Composable annotation before the function 
            3.   
