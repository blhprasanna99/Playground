#include<iostream>
using namespace std;
int main()
{
  int a;
  float t,p=13.30,q=18.00;
  cin>>a>>t;
  if(t==p || t==q) {
    if(a>13) {
      cout<<"$5.00";
    }
    else {
      cout<<"$2.00";
    }
  }
  else {
    if(a>13) {
      cout<<"$8.00";
    }
    else {
      cout<<"$4.00";
    }
  }

}