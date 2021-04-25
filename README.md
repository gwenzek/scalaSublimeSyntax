# sublime-scala-syntax

Improved syntax for Scala in Sublime Text.
This syntax was wrote around release 3084 of ST.
Meanwhile the Scala syntax has been improved and now supports several features
from this syntax.
Still there are some differences that I didn't got integrated in the main
version because the others contributor didn't like them.

The main syntax has probably less bugs because it has been more tested.

As a consequence I'm archiving this repository,
now that we are at build 4102.

## I - Installation

This plugin is available on [package control](https://packagecontrol.io/packages/Scala%20Syntax).
It's recommended you get it from there.  
If you know what you're doing you can also clone the repository in your Packages/User folder.  
If you don't see this plugin in package control is likely because you have a too old version.
The plugin will only be visible with a build >= 3084.

Then you can change a given file using the command `set syntax: Scala2`, or through the menu: `View > Syntax > Scala2`.  
If you like it you can set it as default for .scala files with `View > Syntax > Open all with current extension as ... > Scala2`.  

The new syntax will improve the way your scala code is colored. But to get the best out of it I recommend using the modified version of the Espresso Libre color theme I made. If you don't like Espresso, the diff between the old version and the new one should help you to port your favorite color theme.

## II - Features

Build 3084 of Sublime introduced a new format for syntax definition files.  
The documentation can be found [here](http://www.sublimetext.com/docs/3/syntax.html).

I took this is as a great opportunity to improve the scala syntax highligthing in Sublime.  
The following features has been implemented in this syntax.
Ticked features are now also present in the main Scala syntax.

- [x] string interpolations (like `s"Foo: $foo"`)
- [x] complex method names (like `abc_*^=`)
- [x] annotations (like `@tailrec`)
- [x] xml inside scala code
- [ ] escaped characters (like `'\u2101'`)
- [ ] wrongly escaped characters
- [ ] function calls
- [ ] precice scope for braces and punctutation
- [ ] formatting inside scaladoc comments
- [ ] operators

As I always found my scala files really savorless compared to my python files, I added a bit of color on operators, types and predef methods (`println`, `assert`, ...).  

Also, I put very precise scopes on punctuation allowing the punctuation to be nicely colored. For instance curly braces aren't the same if they mark a class or a function.  

Here is a comparaison between the actual Sublime Text highlighting (version 3140) and mine:
### Default Scala syntax:
![alt text][before]

[before]: https://raw.githubusercontent.com/gwenzek/scala-sublime-syntax/master/before.png "Screenshot with default syntax and Espresso Libre"

### This Scala syntax:
![alt text][after]

[after]: https://raw.githubusercontent.com/gwenzek/scala-sublime-syntax/master/after.png "Screenshot with Scala2 syntax and Espresso2 (from this package)"

## III - Disclaimer

Scala is a complex language with a rich syntax, so I haven't covered all the language yet and I may have introduced regressions.  
If your code is poorly colored please open an issue with a sample.  
