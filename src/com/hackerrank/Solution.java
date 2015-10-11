package com.hackerrank;

import java.util.Scanner;

public class Solution {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _buildingBlocks_size = Integer.parseInt(in.nextLine());
        int[] _buildingBlocks = new int[_buildingBlocks_size];
        int _buildingBlocks_item;
        for(int _buildingBlocks_i = 0; _buildingBlocks_i < _buildingBlocks_size; _buildingBlocks_i++) {
            _buildingBlocks_item = Integer.parseInt(in.nextLine());
            _buildingBlocks[_buildingBlocks_i] = _buildingBlocks_item;
        }
        
        res = calcWaterStored(_buildingBlocks);
        System.out.println(res);
        
    }

	

    static int calcWaterStored(int[] buildingBlocks) {
    	int waterStored = 0;

    	int i = 0;
    	while(i<buildingBlocks.length-1){
    		int k=i+1;
    		if(buildingBlocks[i]> buildingBlocks[k] && k < buildingBlocks.length-1 ){
    			while( !(buildingBlocks[i]<=buildingBlocks[k]) && k < buildingBlocks.length-1 ){
    				k++;
    			}
    			if( buildingBlocks[i]<=buildingBlocks[k]){
    				int j = i;
    				while(j<k-1){
    					int diff = buildingBlocks[i]-buildingBlocks[j+1];
    					if(diff >=0 ){
    						waterStored = waterStored + diff;
    					}

    					j++;
    				}
    			}
    		}
    		i=k;

    	}
    	return waterStored;
    }

}
