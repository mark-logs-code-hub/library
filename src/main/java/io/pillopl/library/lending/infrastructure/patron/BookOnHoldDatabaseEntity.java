package io.pillopl.library.lending.infrastructure.patron;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.Instant;
import java.util.UUID;

@NoArgsConstructor
@Getter
public class BookOnHoldDatabaseEntity {

    @Id
    Long id;
    UUID patronId;
    UUID bookId;
    UUID libraryBranchId;
    Instant till;

    BookOnHoldDatabaseEntity(UUID bookId, UUID patronId, UUID libraryBranchId, Instant till) {
        this.bookId = bookId;
        this.patronId = patronId;
        this.libraryBranchId = libraryBranchId;
        this.till = till;
    }

    boolean hasSamePropertiesAs(UUID patronId, UUID bookId, UUID libraryBranchId) {
        return  this.patronId.equals(patronId) &&
                this.bookId.equals(bookId) &&
                this.libraryBranchId.equals(libraryBranchId);
    }

}
