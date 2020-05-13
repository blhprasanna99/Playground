#include<iostream>
using namespace std;
int main()
{
  int s=6,n,i,a=5;
  cin>>n;
  cout<<s<<' ';
  for(i=1;i<n;i++)
  {
    s=s+a;
    a=a+5;
    cout<<s<<' ';
  }
}