#include<iostream>
using namespace std;
int main()
{
  int y;
  cin>>y;
  if(y%400==0) 
  {
    cout<<y<<" is a leap year";
  }
  else if(y%100!=0 && y%4==0)
  {
    cout<<y<<" is a leap year";
  }
  else 
  {
    cout<<y<<" is not a leap year";
  }
}