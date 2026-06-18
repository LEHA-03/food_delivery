package main.dto;

import java.util.List;

public class MenuItemDTO {

    private String id;
    private String name;
    private String description;
	private List<String> ingredients;


    public MenuItemDTO() {
    }
    
    

	public MenuItemDTO(String id, String name, String description, List<String> ingredients) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.ingredients = ingredients;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getIngredients() {
		return ingredients;
	}



	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}


    
}