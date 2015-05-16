# sublime-scala-syntax

A syntax file for Scala in Sublime

## I - Installation

To use it put the Scala2.sublime-syntax in your Packages/User folder or clone the whole repo there.  
Then you can change a given file using the command `set syntax: Scala2`, or through the menu: `View > Syntax > Scala2`.  
If you like it you can set it as default for .scala files with `View > Syntax > Open all with current extension as ... > Scala2`.  

## II - Features

Build 3084 of Sublime introduced a new format for syntax definition files.  
The documentation can be found [here](http://www.sublimetext.com/docs/3/syntax.html).

I took this is as a great opportunity to improve the scala syntax highligthing in Sublime.  
For instance I improved syntax highlighting for:

* string interpolations (like `s"Foo: $foo"`)
* complex method names (like `abc_*^=`)
* annotations (like `@tailrec`)
* escaped characters (like `'\u2101'`)
* xml inside scala code

Also I always found my scala files really savorless compared to my python files, so I added a bit of color on operators, types and predef methods (`println`, `assert`, ...).

Here is a comparaison between the original Sublime text highlighting and mine:
### Before:
![alt text][before]

[before]: https://raw.githubusercontent.com/gwenzek/scala-sublime-syntax/master/before.png "Logo Title Text 2"

### After:
![alt text][after]

[after]: https://raw.githubusercontent.com/gwenzek/scala-sublime-syntax/master/after.png "Logo Title Text 2"

## III - Disclaimer

Scala is a complex language with a rich syntax, so I haven't covered all the language yet and I may have introduced regressions.  
If your code is poorly colored please open an issue with a sample.  
