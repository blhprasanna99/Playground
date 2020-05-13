#include<iostream>
using namespace std;
int fact(int n)
{
  if(n>1)
   return n*fact(n-1);
  else 
    return 1;
}
int main()
{
  int n,f,t;
  cin>>n;
  t=n;
  f=fact(n);
  cout<<"The factorial of "<<t<<" is "<<f;
}