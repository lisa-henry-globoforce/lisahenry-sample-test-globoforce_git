

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.egit.github.core.SearchRepository;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.RepositoryService;

public class GitTest {
	
	private static final String username = "lisa-henry-globoforce";
	private static final String password = "passw0rd";
	
	public static String searchString;
	public static String releaseTag;
	
	public static void main(String[] args) throws IOException {
		UserInput userInput = new UserInput();
		 
		searchString = userInput.getUserInput_searchString();
		releaseTag = userInput.getUserInput_releaseTag();
		
		GitHubClient client = new GitHubClient();
		
		client.setCredentials(username, password);
        RepositoryService service = new RepositoryService(client);
        
        List<SearchRepository> searchRes = null;
		try{
			searchRes = service.searchRepositories(searchString);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
        System.out.println("Search result "+searchRes.toString());
		
		
        
        

	}

}
