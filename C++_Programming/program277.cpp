// OOP approach

#include<iostream>
using namespace std;

class Arithematic
{
    public:
        int No1;
        int No2;

    Arithematic(int A, int B)
    {
        No1 = A;
        No2 = B;
    }

    int Addition()
    {
        int Ans = 0;
        Ans = No1 + No2;
        return Ans;
    }

    int Substraction()
    {
        int Ans = 0;
        Ans = No1 - No2;
        return Ans;
    }

};

int main()
{
    Arithematic aObj(11,10);

    cout<<"Addition is : "<<aObj.Addition()<<"\n";
    cout<<"Substraction is : "<<aObj.Substraction()<<"\n";

    return 0;
}