#include<iostream>
using namespace std;
int main()
{
  int a,i,c=0;
  float s=0;
  while(c<3)
  {
    cin>>a;
    if(a>0)
    {
      if(a%2==0)
        s=s-0.5;
      else
      {
        s=s+1;
        c++;
      }
    }
    else
    {
      s=s-1;
      break;
    }
  }
  printf("%.1f",s);
}