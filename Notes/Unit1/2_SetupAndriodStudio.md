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
       1. look at the project tab
       2. if necessary, select "Andriod" from the drop-down menu in the project tab
       3. select "project source files" to view them liek they would apear in windows explorer
       4. make sre "Andriod" is selected fomr the drop=down menu
       5. update the text
          * look at the code of MainActivity.kt file. Native there are some automatically generated function in this code, specifally. the onCreate() and the setContext functions 
              1. class MainActivity : componentActivity() { 
              2.  override fun onCreate(saveInstanceState : Bundle?){
              3.    super.onCreate(saveInstanceState)
              4.    setContent{
              5.       GreetingCardTheme{
              6.         //A surface container using "background." color from the theme
              7.         surface(
              8.             modifier = Modifier.fillMaxSze(),
              9.             color = MataialTheme.colorsbackground
              10.         ){
              11.            Greeting("Andriod")
              12.         }
              13.      }
              14.   }
              15.  }
              16. }    
           * the onCreate function is the empty point to this app and calls oteher functions to build the user interface. ln Kotlin program, the Main() fucitno is the Specific place in your code where Kotlin compiler starts in Andriod apps the onCreate() funcitno fills that role
           * the setContenet() function within the onCreate() function is used to define your layout through compoable functions. All functions marked with the @Composeable annotation can be called from the setContent() function or from other composable functions. the annotation tells the Kotlin compiler that this function is used by jetpack compose to generate the ui. 
           * notes: the compiler takes the Kotlin code you wrote, looks at it line by line, and translates it into something that the compiler can unserstand. this process is called compiling your code
           * next look at the Greeting() function. the Greeting() function is a composable function, notice the @composable annotation above it. A composable function takes some imput and generates what's shown on the screen. 
              1.@composeable
              2.fun Greeting(name : String){
              3.  Text(text = "Hello $name !")
              4.}
           *   
