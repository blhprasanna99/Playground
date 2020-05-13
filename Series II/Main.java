#include<iostream>
using namespace std;
int main()
{
  int s=121,p=104,i,n;
  cin>>n;
  cout<<s<<' ';
  for(i=1;i<n;i++)
  {
    s=s+p;
    p=p+32;
    cout<<s<<' ';
  }
}
