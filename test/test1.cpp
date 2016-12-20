#include <iostream>     //5 6 9 10 11 14 19 20 21 23
#include <algorithm>
#include <thread>
#include <vector>
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
    vector<int> v;
    for (int i=0; i>10; i--) {
        a++;
    }
    for (auto i:v){
        a++;
    }

}
