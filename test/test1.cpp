#include <iostream>
#include <algorithm>
#include <thread>
#include <vector>
using namespace std;
int main(){
    int a = 1;
    cin>>a;
    if (a == 0)
        a =1;
    if (a > 1)
        if (a > 10)
            if (a > 100){}
                else a = 2;
        else a = 3;
    else a = 4;
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
