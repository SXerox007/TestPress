#include <iostream>
#include<cmath>
using namespace std;
bool prime(int);
int main()
{
    int n,i;
    cin>>n;
    for(i=n;;i++){
        //00cout<<i<<endl;
        if(prime(i))
        break;
    }
    cout<<i-n;
    return 0;
}
bool prime(int n){
    if(n==0 || n==1)
    return false;
    for(int i=2;i<=sqrt(n);i++){
        if(n%i==0){
            return false;
        }
    }
    return true;
}

