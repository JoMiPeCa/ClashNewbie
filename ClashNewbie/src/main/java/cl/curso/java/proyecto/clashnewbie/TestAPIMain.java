package cl.curso.java.proyecto.clashnewbie;

import java.io.IOException;

import com.btilm305.clashapi.BTClashWrapper;
import com.btilm305.clashapi.ClashAPI;
import com.btilm305.clashapi.Player;
import com.btilm305.clashapi.exception.ClashException;

public class TestAPIMain {

	public static void main(String[] args) {

		String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6IjQyOTk0YWFkLWRiODUtNGNkNC1iYTQxLTljNmRkOTg1NmU1MCIsImlhdCI6MTQ2ODU5ODUxMywic3ViIjoiZGV2ZWxvcGVyL2I1YThhZWVkLWZmZmQtOTUxYS0yOWZlLWFmMzU3NmY0ZWJmOSIsInNjb3BlcyI6WyJjbGFzaCJdLCJsaW1pdHMiOlt7InRpZXIiOiJkZXZlbG9wZXIvc2lsdmVyIiwidHlwZSI6InRocm90dGxpbmcifSx7ImNpZHJzIjpbIjIwMS4yMjMuMTk3LjQ0Il0sInR5cGUiOiJjbGllbnQifV19.UQIAVnn1An_Y5Kqb7AawpGWsIyV50slw3Ox2OP2iwr4YahydIJhsn2ruJwyrenV0tlVBxJ1HDM_MHUi3YFBpGg";

		// DEMONZ INFORMATION:
		String clanTAG = "#LPUC290V";
		String userTAG = "#LY8GRCVV";
		int intern = 32000006;

		ClashAPI clashAPI = BTClashWrapper.getAPIInstance(token);
		try {
			System.out.println("Probando: " + clashAPI.requestTopClans(intern).size());
			
		} catch (ClashException | IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
