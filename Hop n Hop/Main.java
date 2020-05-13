#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  int x1=3,y1=4,x2,y2,r;
  double p1,p2;
  cin>>x2>>y2;
  p1=pow((x2-x1),2);
  p2=pow((y2-y1),2);
  r=(int)sqrt((p1+p2));
  cout<<r;//Type your code here.
}