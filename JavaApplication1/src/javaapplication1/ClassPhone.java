/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


/**
 *
 * @author Maria
 */
public class ClassPhone 
{
    private String Brand; 
    private String Model;
    private String OperationSystem;
    private String Color;
    private int Lenght;
    private int Width;
    private int numofButtons;
    private int screenSize;
    private int Memory;   
    
    
    public ClassPhone(String Br, String Md,String OSystem,
            String Col, int L,int W, int NumBut,int ScrSz,int Mem)
    {
        Brand = Br; 
        Model = Md; 
        OperationSystem = OSystem; 
        Color = Col;
        Lenght = L; 
        Width = W;
        numofButtons = NumBut; 
        screenSize = ScrSz;
        Memory = Mem; 
    }
    
    //
    //-----------------------------
   
    public String GetBrand()//Возвращаем бренд 
    {
        return Brand; 
    }
    public String GetModel()//Возвращаем модель
    {
        return Model;
    }
    public String GetOS()
    {
        return OperationSystem; 
    }
    public String GetColor()
    {
        return Color; 
    }
    public int GetLenght()
    {
        return Lenght; 
    }
    public int GetWidth()
    {
        return Width;
    }
    public int GetButtons()
    {
        return numofButtons; 
    }
    public int GetScrSize()
    {
        return screenSize; 
    }
    public int GetMemory()
    {
        return Memory; 
    }
    
     
    public void SetOS(String OS)
    {
        OperationSystem =  OS; 
    }
    public void SetMemory(int Mem)
    {
        Memory = Mem; 
    }
    public void SetColor(String C)
    {
        Color = C;
    }
    
    
}
