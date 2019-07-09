public class hello{
public static void main (String args[]){
String s="amazing java";
String chArr[]=s.split(" ");
s="";
for(int i=chArr.length-1;i>=0;i--)
{
	s=s+" "+chArr[i];
}
System.out.println(s);
}}