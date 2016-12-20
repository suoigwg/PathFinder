#include <iostream>

using namespace std;

int main(){
    int a = 1;
    if (a < 0) {
        a = -a;
    }else{
        a = a;
    }
    while (a < 0) {
        a++;
    }
    switch (a) {
        case 0:
            a = a+1;
            break;
        case 1:
            a = a-1;
        default:
            break;
    }
}
