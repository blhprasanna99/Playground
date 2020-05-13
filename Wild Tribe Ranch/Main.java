#include<iostream>
int main()
{
  int max,weight;
  std::cin>>max>>weight;
  if(weight<max)
  {
    std::cout<<"Yes, you can enter.";
  }
  else if(weight==max)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else {
    std::cout<<"Sorry, you can't enter";
  }
}