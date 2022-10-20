package miHexagonal.core.driven_ports;

import miHexagonal.core.domain.Book;

public interface BookRepository {
	Book findById(Long id);
}
