#include<iostream>
using namespace std;
int main()
{
  int a,b,c,m1,m2,m3,code=1,i;
  cin>>a>>b>>c;
  if(a>b || b>c)
  {
    if(a>c)
      m1=a;
    else 
      m1=b;
  }
   else {
     m1=c;
   }
  if(m1==a || m1==b || m1==c)
  {
    if(a==m1)
    { 
      if(b>c && b<a)
      {
      m2=b;
      m3=c;
      }
      else
      {
        m2=c;
        m3=b;
      }
    }
    else if(b==m1)
    {
      if(c<b && c>a)
      {
      m2=c;
      m3=a;
      }
      else
      {
        m2=a;
        m3=c;
      }
    }
    else {
      if(b<c && b>a)
      {
        m2=b;
        m3=c;
      }
      else {
        m2=c;
        m3=b;
      }
    }
  }
  for(i=2;i<=m3;i++)
  {
    if(a%i==0 && b%i==0 && c%i==0)
    {
      code=i;
      break;
    }
  }
  cout<<"The treasure is in box which has number "<<m2;
  cout<<"\nThe code to open the box is "<<code;
  //Type your code here.
}