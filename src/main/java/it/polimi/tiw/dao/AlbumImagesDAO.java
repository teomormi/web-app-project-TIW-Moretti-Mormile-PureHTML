package it.polimi.tiw.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlbumImagesDAO {
private Connection connection;
	
	public AlbumImagesDAO(Connection connection) {
		this.connection = connection;
	}

	public void addImageToAlbum(int imgId, int albumId) throws SQLException {
		String query = "INSERT into albumimages (image, album) VALUES (?, ?)";
		try(PreparedStatement pstatement = connection.prepareStatement(query);){
			pstatement.setInt(1, imgId);
			pstatement.setInt(2, albumId);
			pstatement.executeUpdate();
		}
	}
}
