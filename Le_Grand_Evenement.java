import static algorea.Robot.*;

class Main {
    public static void main(String[] args)
     {
     
     for (int i = 0; i < 9; i++) 
        {  haut();  }
        droite();
        
        
        
        
        
        
        
        
        for(int k=0;k<4;k++)
        {
           
        for (int j = 0; j < 8; j++) 
        { bas();  }

           
            droite();
            
            
            
        
        for (int i = 0; i < 8; i++) 
        {  haut();  }
        droite();
        

           
    }
    
    for (int j = 0; j < 9; j++) 
        { bas();  }

           

    
     for (int i = 0; i < 9; i++) 
        {  gauche();  }
    
}
}