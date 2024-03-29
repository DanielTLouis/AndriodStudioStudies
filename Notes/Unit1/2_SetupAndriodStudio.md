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
           *  you've learned about functions before (if you need a refresher, go back a pathway), but there are a few difference with composable funcitons
             * @Composable function names are capitalized 
             * you add the @Composable annotation before the function 
             * @compoable function can't return anything 
           * right now the Greeting() funcitons takes in a name and displays Hello to that person
             1.update the Greeting() function to introduce yourself instead of saying "Hello":
                 1.@Composable
                 2.fun Greeting(name : String){
                 3.  Text(text="Hi, My name is $name !")
                 4.}   
             2.rebuild the defualt preview by pressing the rebuild button on the top. left of the design pane:
                 * Hi, my name is Andriod!
         * Great! you changed the text, but it introduces you are Andriod, which is probably not your name. Next, you will personalize it to introduce you with your name!
           * the DefualtPreview() function is a cool function that lets you see what your app looks like without having to build your entire app. in order to be a preview function, you need to add a @Preview annotation
           * as yu can see, the @preview annotation takes in a paramater called showBackgounrd. if showBackground is set to true, it will addabackground to your app preview
           * Since Andriod Studio by defualt uses a lgiht theme for the editor, it can be hard to see the difference between showbackground = true and showbackgroud = false. However, this is what the difference looks liek with a dark theme. Notice the white background on the image set to true
                * It is matched to the background of the phone
              3.update the DefualtPreview() function with your name. then rebuild and check out your personalized greeting card.
                 1.@preview(ShowBackground=true)
                 2.@Composable
                 3.fun DefualtPreview(){
                 4.  GreetingCardTheme{
                 5.     Greeting("Meghan")
                 6.   }
                 7. }
                 * defualt preview
                   * Hi, my name is Meghan!
       6.change the backGround color
          * now you have the introduction text, but it is a little boring! now you learn to chanve the background coo"
          * to set a different background color for your introductions you'll need to surround your text a with a surface. A surface is container that represent a section a section of UI where you can alter the appearance, such as the background color or border
             1. to surround the text with a surface, highlight the line of text, press (Alt + Enter for winfows or option + enter for macs). and then select surround with widget
             2. choose surround with container 
           * the defualt container it will give you is Box, but you can change this to another container type
              1.@Composable
              2.fun Greeting(name : String){
              3.  Box{//this : BoxScope
              4.     Text(text="Hello, $name !")
              5.  }
              6. }
             3.Delect Box and type Surface() instead 
               1.@Composable
               2.fun Greeting(name : String){
               3.  Surface(){
               4.     Text(text="Hello, $name !")
               5.  }
               6. }
              4.The Surface container has a color paramater, set it to color
                1.@Composable
                2.fun Greeting(name : String){
                3.  Surface(color=Color){
                4.     Text(text="Hello, $name !")
                5.  }
                6. }
              5.When you type color you may notice that it is red and underlined. To solve this scroll to the top of the file where it says import and press the three buttons 
                 * import...
              6.add this statement to the bottom of the list of imports 
                 * import andriodx.compose.ui.graphics.color
           * the fall list of imports will look like this"
                 1.import andriod.os.Bundle
                 2.import andriodx.activity.componentActivity
                 3.import andriodx.activity.compose.SetContent
                 4...
              7. in your code, the best practive is to keep your import list alphabetically. To do this press Help on the top toolbar, type in optimize import, and click on optimize imports 
            * the fall list is now in alphabetical order
              8. notice that the color that you typed in the surface parentheses has switched from being red and underline to being underline in red. to fix that, add a period after it. you will see a pop-up showing different color options
            * this is one of the cool features in Andriod Studio. It is intelligent and will help you out when it can. In this case it knows you are wanting to specify a color so it will suggest different colors
              9. choose a color for your surface. This codelab uses magente, but you can choose your fav!
                 1.@Composable
                 2.fun Greeting(name : String){
                 3.  Surface(color=Color.magenta){
                 4.     Text(text="Hi, my name is $name !")
                 5.  }
                 6.}
              10. click Build & Refreash your text is surounded by the color that you choose
       7. Add padding
          *  Now your text has a background color, next you wil add some space (padding) around the text
          *  a modifier is used to argument or decorate a composable. One modifier you can use is the padding modifier, which applies space around the element (in this case, adding space around the text). Tis is accoplishhing by using the modifier.padding() function 
          1. add these imports to the import statemenrs section
             * make sure to use optimize imports to alphabetize the new imports
                1.import andriox.compose.ui.unit.dp
                2.import andriodx.compose.function.layout.padding
           2. Add a padding modifier to the text with a size of 24 dp. click build and refreash 
              * Note: you learn more about density-independent pixels (dp) in the next pathway
              1.@Compose
              2.fun Greeting(name : String){
              3.  Surface(color = Color.Magenta){
              4.    Text(text="Hi, $name !", modifire = Modifier.padding(24.dp))
              5.  }
              6.}
              * you build your first Andriod app in compose! this is a pretty huge accomplishment
         8. Review the solution code
            1.  import andriod.os.Bundle
            2.  import andriodx.activity.ComponentActivity 
            3.  import andriodx.activity.compose.SetContnet
            4.  import sndriodx.compose.foundation.layout.padding
            5.  import andriodx.compose,material.materialTime
            6.  import andriodx.compose.material.Surfaceimport andriod.compose.material.Text
            7.  import andriodx.compose.runtime.Composable
            8.  import amdriodx.compose.ui.Modifier
            9.  import andriodx.compose.ui.graphics.Color 
            10. import andriodx.compose.ui.tooling.preview.Preview
            11. import andriodx.compose.ui.united
            12. import com.example.myapp.ui.theme.GreetingCardTheme
            13. 
            14. class MainActivity : ComponentActivity(){
            15.   override fun onCreate(savedInstanceState : Bundle){
            16.     Super.onCreate(SavedInstanceState)
            17.     setContent{
            18.        GreetingCardTheme{
            19.          //A Surface container that uses the background color fomr the theme
            20.          Surface(color = MaterialTheme.colors.background){
            21.             Greeting("Andriod")
            22.          }
            23.        }
            24.     }
            25.   }
            26. } 
            27. @Composable
            28. fun Greeting(name : String){
            29.    Surface(color = Color.Magenta){
            30.       Text(text = "Hi, my name is $name !", modifier = Modifier.padding(24.dp))
            31.    }
            32. }
            33. @Preview(ShowBackground = true)
            34. @Composable
            35. fun DefualtPreview(){
            36.    GreetingCardTheme{
            37.       Greeting("Megenta")
            38.    }
            39. }
         9. Conclusion 
            * Summary
              * to create a new project: open Andriod Studio click new project > Empty Compose Activity > Next, enter your name 
              * 
* Run your first app on the Emulator
   1. Before you Begin 
   2. watch the code-along video
      * in Andriod Studio next to the play button there is an option for a device 
        * click on that to see the dropdown menu
        * choose device manager
        * click create device 
          * choose phose 
          * choose API (highest one with a letter)
   3. Run your app on the Andriod Emulator 
      * create a AVD
        * To run an andriod app in an emulator on your computer, your first create a virtual device 
        1. in Andriod Studio, select Tools -> Device Manager
        * Device Manager dialog opens if you created a virtual device previously, it's listed in this dialog 
        2. click create virtual Device 
        * the virtual device configuration diolog appears 
        * the dialog shows a list of pre-configured devices organized by catagory, from which you can choose, For each device the tble provides a column for its display size (in inches). Screen resolution (in pixels), and pixel density (number of pizels per inch).
        3. select phone as catagory 
        4. select a phone, such as the pixel 5, and then click next. 
        * ths step opens another screen where you can choose the version of Andriod to run on your virtual device. This lets you test your app on different versions of andriod
        5. if there is a download link next to S.click download -> accept -> next -> finish. the presence of the download link indicates that the image isn't installed on your computer, in which case you must install the image before you can configure the virtual device expet the download to take some time ito complete.
        6.  in the recommended tab, choose S as the version of Andriod to run the virtual device
        * Andriod S is the latest version of Andriod at the time of writing, but you can choose any later stable version,
        * this action opens another screen, where you can choose additional configuration details for your device.
        7. in the AVD name feild, enter a name for your AVD or use the defualt. leave the rest of the feields unchanged 
        8. click finish
        * this action retain to the Andriod Virtual Device manager pane
        9. close the device manager dialog 
    * run your app on the Andriod Emulator
        1. select the virtual device that you created from the dropdown menu at the top of the avdriod Studio window
        2. click play button
        * the virtual device starts ust like a physical device. expect this to take a while-potentially serveral minutes - for the emulator to start for the first time. the virtual device should open beside the code editor
        * when your app is ready. it opens on the virtual device 
        * should see your app now
    * conclusion
  5. How to connect your andriod device
     1. Before you begin
     2. watch the code-along video
        * run your app on andriod device 
          * with cable or wifi
        * enable usb developer debugging on the device 
          * settings -> about phone 
          * tap build number 7 times 
            * should see a you are now a developer message
            * go to system -> developer options 
              * make sure usb internal toggle is enabled 
           * in Andriod Studio 
             *  Dropdown the manu next the play buttom 
               * find your device & press play
     3. Enable USB debugging 
        * to let Andriod Studio communicate with you Andriod device, you must enable usb debbuging in the device per options setting of the device. 
        * to show developer options and enable usb debugging
           1. on your Andriod device, tap setting->About phone 
           2. tab build number seven times 
           3. if promted, enter your device password or pin. you knwo you succeeded when you see a "you are now a developer!" message
           4. return to settings and then tap system -> developer optaions
           5. if you don't see developer optaions, tap Andriod options 
           6. tap Developer options and then tap the usb debugging toggle to turn it on
         * install the google usb driver (windows only)
           * if you install Andriod Studio on windows, you must install a usb device before you can run your app on a physical devie
             1. in Andriod Studio, click Tools->SDK manager, the Preference->Appearance & Behavior system. 
             2. click the SDK Tools tab
             3. select Google usb driver and then choose ok
           * when done, the driver files are downloading into the andriod_sdk\extras\google\usb_driver directory. Now you can connect and run your app from Andriod studio
      4. Run your app on the Andriod deviece with a cable 
         * there are two ways to connect your device to Android studio, through wifi, you can choose whichever you like more.   
