#include<iostream>
using namespace std;
int main()
{
  int size=0,f=0,f1=1,m,i,f2;
  cin>>m;
  for(i=2;i<m;i++)
  {
    f2=f+f1;
    f=f1;
    f1=f2;
   }
  cout<<f2;//Type your code here.
}