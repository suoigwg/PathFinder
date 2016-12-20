#include <iostream>     //5 6 9 10 11 14 19 20 21 23
#include <algorithm>
#include <thread>
#include <vector>
using namespace std ; int main ( ) { stdout = freopen("ir.c","w",stdout);
 printf("%d ", 7);
int a = 1 ;  printf("%d ", 8);
if ( a < 0 ) {  printf("%d ", 9);
a = - a ;  printf("%d ", 10);
} else {  printf("%d ", 11);
a = a ;  printf("%d ", 12);
}  printf("%d ", 13);
while ( a < 0 ) {  printf("%d ", 14);
a ++ ;  printf("%d ", 15);
}  printf("%d ", 16);
switch ( a ) {  printf("%d ", 17);
case 0 :  printf("%d ", 18);
a = a + 1 ;  printf("%d ", 19);
break ;  printf("%d ", 20);
case 1 :  printf("%d ", 21);
a = a - 1 ;  printf("%d ", 22);
default :  printf("%d ", 23);
break ;  printf("%d ", 24);
}  printf("%d ", 25);
vector < int > v ;  printf("%d ", 26);
for ( int i = 0 ; i > 10 ; i -- ) {  printf("%d ", 27);
a ++ ;  printf("%d ", 28);
}  printf("%d ", 29);
for ( auto i : v ) {  printf("%d ", 30);
a ++ ;  printf("%d ", 31);
}  printf("%d ", 32);
} 