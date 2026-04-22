package utility;

import com.bookSystem.author_service.dto.AuthorRequestDTO;
import com.bookSystem.author_service.dto.AuthorResponseDTO;
import com.bookSystem.author_service.entity.Author;

public class AuthorMapper {


    public static Author toEntity(AuthorRequestDTO dto){
        Author author = new Author();
        author.setName(dto.name());
        if(!dto.bookIds().isEmpty()){
            author.setBookIds(dto.bookIds());
        }
        return author;
    }

    public static AuthorResponseDTO toDto(Author author){
        return new AuthorResponseDTO(
                author.getId(),
                author.getName(),
                author.getBookIds()
        );
    }
}
