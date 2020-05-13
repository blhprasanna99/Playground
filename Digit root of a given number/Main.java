#include<iostream>
using namespace std;
int digits(int n)
{
  if(n==0)
    return 0;
  else
    return (n%9==0)?9:(n%9);
}
int main()
{
  int n;
  cin>>n;
  cout<<digits(n);
}