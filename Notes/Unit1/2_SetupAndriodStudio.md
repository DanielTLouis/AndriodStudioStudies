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
            3. Composable functions cannot return anything
          * change text in greeting to my name is plus a variable of your name (right now your name is "Andriod" need to change that to)
            1. @Compocable
            2. fun Greeting(name : string){
            3.   Text(text="Hi, my name is $name!")
            4. }
          * can make preview function to preview it without building 
            * make preview functinos for this 
            * show background will just put a white ackground. if it is false in dark mode the words will be ontop of the dark grey background instead of white
            * change the andriod name to your own to see how your app updates
              1.@preview(showBackground = true)
              2.@composable
              3.fun DefualtPreview
              4.  GreetingCardThere{
              5.     Greeting(name :"Dan")
              6.  }
              7.}
            * to change background color for the text you need to make a surface behind your text 
              * highlight the line of text and click alt enter -> surround with container
                * Defulat container we get is Box 
                  * Delete Box & type surface instead
                  * add color as well
              * example of new Greeting function:
                 1.@Composable
                 2.fun Greeting(name : String) {
                 3.   Surface(color = Color.Green) {
                 4.      Text(text = "Hi, my name is $name")
                 5.   }
                 6. }
            * using padding modifiyer to make some space around your text
              1. Text(text = "Hi, my name is $name", modifier.padding(24.dp)
            * first app done
    * 3. create a project using the template 
      1. launch Andriod Studio 
      2. in the "welcom to Andriod Studio" dialog, clikc "new project" 
      3. mkake sure the "phone and tablet" tab is selected 
      4. click the "empty compose activity" template to select it as the templeate for your porject 
        * the empty compose activity template is the build a compose app. it has a single screen and display the text "Hello, Andriod!" 
      5. click next. the project dialog opens. this has some fields to configure your project
      6. configure your project follows 
         * Name field - Enter "Greeting Card" 
         * leave save location as is
         * "kotlin" is already selected in the "language" field 
       7. hit finish
       8. you may see a "what's new pane" 
          * just close it. 
       9. click "split" on the top right of Andriod Studio, this allows you to view both code and design 
       10. click build and refresh 
          * should show "helloe, andriod!" 
   * 4. Find project files
       1,         
