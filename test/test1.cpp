#include <iostream>     //5 6 9 10 11 14 19 20 21 23
#include <algorithm>
#include <thread>
#include <vector>
using namespace std;
//7 8 10 13 14 13 15 18 21 33 34 35 36 37 41 48
int main(){
    int a = 1;
    cin>>a;
    if (a == 0) a =1;
    else a = 2;
    if (a < 0) {
        a = -a;
    }else{
        a = a;
    }


    while (a == 0) a++;
    while (a < 0) {
        a++;
    }

    switch (a) {
        case 0:
            a = a+1;
            break;
        case 1:
            a = a-1;
            a = 2;
            a = 3;
            a = 4;
            break;
        case 2:
            a = a-1;
            a = 2;
            a = 3;
            a = 4;
            break;
        default:
            break;
    }

    for (int i=0; i>10; i--)
        a++;
    for (int i=0; i<10; i++) {
        a = 1;
        a = 2;
    }
}
