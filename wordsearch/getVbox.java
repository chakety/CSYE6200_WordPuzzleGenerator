public VBox getVbox(TextField text, Label l1) {
		VBox vbox = new VBox();
		vbox.setAlignment(Pos.TOP_RIGHT);
		vbox.getChildren().addAll(text,l1);
		
		return vbox;
	}
	
