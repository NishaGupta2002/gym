package com.exception;

public class ResourcesNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private static final long serviceVersionUID = 1L;
	private String message;
	
	public  ResourcesNotFoundException()
	{
		 super("Trainer not found");
	}

	public ResourcesNotFoundException(String message) {
		super();
		this.message = message;
	}
	
}
