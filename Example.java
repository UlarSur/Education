 /* 
Первая простая программа на Java. 
В Java весь код должен размещаться в классе. 
По принятому соглашению имя главного класса должно совпадать 
с именем файла, содержащего исходный код программы. 
В коде Java учитывается регистр символов, это означает что имя class не равнозначно имени Class. 
*/
class Example {  /* в этой строке ключевое слово class служит для обьявления вновь определеяемого класса, 
	                a Example - в качестве идектификатора, обозначающего имя класса.*/
	
	 public static void main (String args[]) { //разбор кода 11 строки начинается с 18 до 42 строки
		 System.out.println("Простая программа на Java."); // разбор кода 12 строки начинается с 44 до 55 строки
	 } 
}	     /* Все определение класса, в том числе его членов, должно располагаться между 
	 	  открывающей { и закрывающей } фигурными скобками. В среде Java все действия 
	 	  программы выполняются в пределах класса. */

/* Выполнения всех прикладных программ на Java начинается с вызова метода main ()
 Ключевое слово public является модификатором доступа, который дает программисту 
 возможность управлять видимостью членов класса. Когда члену класса предшествует
 ключевое слово public, этот член доступен из кода за пределами класса, где он определен. 
 Противоположное обозначает слово private - оно не разрешает доступ к члену класса из кода 
 за пределами данного класса.В данном случае метод main () должен быть определен как public,
 поскольку при запуске программы он должен вызываться из кода за пределами его класса.  
 Ключевое слово static позволяет вызывать метод main () без получения экземпляра класса. 
 Это необходимо потому, что метод main () вызывается виртуальной машиной JVM перед созданием 
 любых объектов. А ключевое слово void просто сообщает компилятору, что метод main () не возвращает 
 никаких значений. 
 Для передачи любой информации, требующейся методу, служат переменные, указываемые в скобках вслед 
 за именем метода, в данном случае за методом main ().Это переменные называются параметрами.
 Если параметры не требуются методу, то указываются пустые скобки. У метода main () имеется единственный,
 хотя и довольно сложный параметр. Так, в выражении String args [] объявляется параметр args, обозначающий 
 массив экземпляров класса String. (Массивы - это коллеекция похожих объектов). В объектах типо String
 хранятся символьные строки. В данном случае параметр args принимает любые аргументы командной строки, присут-
 ствующие во время выполнения программы. Метод main () служит всего лишь началом программы. Сложная программа 
 может включать в себя десятки классов, но только один из них должен содержать метод main (), чтобы программу
 можно было запустить на выполнение. Но в некоторых случаях метод main () вообще не требуется, например, 
 при создании аплетов-прикладных программ на Java, внедряемых в веб-браузеры. Метод main () в аплетах не требуется
 потому, что для их запуска выполнение применяются другие средства. 
 Последним элементом в рассматриваемой 11 строке кода оказывается символ открывающей фигурной скобки { . Он
 обозначает начало тела метода main (). Весь код, составляющий тело метода, должен располагаться между открывающей 
 и закрывающей фигурными скобками в определении этого метода. */

/* В 12 строке код на экран выводит строку "Простая программа на Java" с последующим переходм на новую строку. 
 Вывод текста на экран выполняется встроенным методом println (). В данном случае метод println() отображает
 переданную ему текстовую строку. С помощью этого метода можно выводить и другие типы данных.
 System это слишком сложная языковая конструкция, но вкратце System обозначает предопределенный класс,
 предоставляющий доступ к системе, а out - поток вывода, связанный с консолью. 
 В реальных программах на Java консольный вывод-ввод применяется редко. Многие современные вычислительные
 среды по своему характеру являются оконными и графическими, поэтому консольный вввод-вывод зачастую применяется 
 в простых служебных и демонстрационноых программах. 
 Метод println() завершается точкой с запятой. В языке Java все операторы обычно должны оканчиваться этим символом. 
 Причина отсутствия точки с запятой в конце остальных строк кода программы состоит в том, что формально 
 они не являются операторами. Первый символ } завершает метод main (), а последний символ  } - определение 
 класса Example.*/


/* в Java поддерживаются три вида комментариев. 
Комментарий приведенный в начале программы, называется многострочным. 
Этот вид комментариев должен начинаться с символов /* и заканчиваться символами */
// Весь текст расположенный между этими двумя парами символов, игнорируется компилятором.

// Данная строка содержит вид одострочного комментария. 

/* Как правило, многострочными комментариями пользуются для вставки длинных примечаний
 а однострочными - для коротких, построчных описаний */ 

