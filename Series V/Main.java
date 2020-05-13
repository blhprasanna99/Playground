#include<iostream>
using namespace std;
int main()
{
  int n,s=121,d=104,i;
  cin>>n;
  cout<<s<<' ';
  for(i=1;i<n;i++)
  {
    s=s+d;
    d=d+32;
    cout<<s<<' ';
    
  }//Type your code here.
}