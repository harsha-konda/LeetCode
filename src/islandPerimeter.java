package solution;

public class islandPerimeter {
    public int islandPerimeter(int[][] grid) {
    	int sum=0;
    	for(int i=0;i<grid.length;i++){
    		int horLen=grid[i].length;
    		for(int j=0;j<horLen;j++){
    			int a=(i>0)?grid[i-1][j]:0;
    			int b=(i<(grid.length-1))?grid[i+1][j]:0;
    			int c=(j>0)?grid[i][j-1]:0;
    			int d =(j<(grid[i].length-1))?grid[i][j+1]:0;
    			sum+=((grid[i][j]==1)?(4-a-b-c-d):0);
    		}		
    	}    
    	return sum;

    }
}
