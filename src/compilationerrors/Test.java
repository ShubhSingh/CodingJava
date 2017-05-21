package compilationerrors;

/* How does below code work?
 * Output is given in TestOutput.jpg
 * MS-DOS/Windows treats all files which start with CON as the console.
 * So when javac writes the Con.class file, it is written to the console instead.
*/

 class Con {
	static String hi = "\n\nHello\n\n";
}
