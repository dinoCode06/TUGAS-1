public class Operator {
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */
boolean Bool1, Bool2, TF ;
int i,j, hsl ;
float x,y,res;
/* algoritma */
System.out.println ("Silahkan baca teksnya dan tambahkan perintah program di bawah ini untuk menampilkan output program");
Bool1 = true; Bool2 = false;
// Boolean
TF = Bool1 && Bool2 ; 
System.out.println("AND : " + TF);
TF = Bool1 || Bool2 ; 
System.out.println("OR : " + TF);
TF = ! Bool1 ; 
System.out.println("NOT : " + TF);
TF = Bool1 ^Bool2; 
System.out.println("XOR : " + TF);

// operasi numerik
i = 5; j = 2 ;
hsl = i+j;
System.out.println("i+j : " + hsl);
hsl = i - j;
System.out.println("i-j : " + hsl);
hsl = i / j;
System.out.println("i/j : " + hsl);
hsl = i * j;
System.out.println("i*j : " + hsl);
hsl = i%j ;
System.out.println("i%j : " + hsl);
// float
x = 5 ; y = 5 ;
res = x + y;
System.out.println("x+y : " + res);
res = x - y;
System.out.println("x-y : " + res);
res = x / y;
System.out.println("x/y : " + res);
res = x * y;
System.out.println("x*y : " + res);

// relasional int
System.out.println("i==j : " + (i==j));
System.out.println("i!=j : " + (i!=j));
System.out.println("i<j : " + (i<j));
System.out.println("i>j : " + (i>j));
System.out.println("i<=j : " + (i<=j));
System.out.println("i>=j : " + (i>=j));
// relasional float
System.out.println("x!=y : " + (x!=y));
System.out.println("x<y : " + (x<y));
System.out.println("x>y : " + (x>y));
System.out.println("x<=y : " + (x<=y));
System.out.println("x>=y : " + (x>=y));

}
}