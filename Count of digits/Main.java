#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  cin>>n;
  do {
    c=c+1;
    n=n/10;
  }while(n>0);
  cout<<c;// Type your code here
}