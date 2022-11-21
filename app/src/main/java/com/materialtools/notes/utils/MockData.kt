package com.materialtools.notes.utils

import android.os.Build
import androidx.annotation.RequiresApi
import com.materialtools.notes.models.Note
import java.time.LocalDate
import java.util.*

object MockData {
    const val fakeNoteDetail =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed in purus tortor. Vivamus aliquam rutrum justo. Donec quis tempus sem, sit amet sodales eros. Nunc ultrices accumsan molestie. Vivamus lacinia erat placerat molestie aliquet. Sed lorem massa, fringilla sit amet sagittis in, dignissim aliquam ex. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Nam sit amet ultricies odio. Proin vehicula non ante vitae posuere. Ut vel tortor tortor. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Praesent viverra vel mauris eget sodales. In porta sed justo sed dapibus. Nullam eu elementum nisl. In porttitor cursus felis, eu auctor est pharetra eu.\n" +
                "\n" +
                "Vestibulum est nunc, eleifend eu gravida sed, eleifend vel nibh. Etiam semper pellentesque mauris a gravida. Vivamus dictum felis lectus, eu tempus erat convallis eu. Etiam feugiat sem sapien. Etiam volutpat pharetra augue pharetra vulputate. Pellentesque pulvinar sollicitudin tellus ac maximus. Integer blandit lacinia nisi, eu rutrum massa imperdiet ac. Morbi pharetra erat non maximus pellentesque. Integer vestibulum suscipit sollicitudin. Ut aliquam nibh at auctor placerat.\n" +
                "\n" +
                "Nam congue ante et nisl tincidunt ultrices eget eget felis. Integer aliquam purus sed luctus lobortis. Suspendisse ultrices magna id convallis interdum. Suspendisse dapibus enim vel orci ultrices imperdiet. Vestibulum volutpat felis id sodales ultricies. Vestibulum laoreet sollicitudin enim, in consectetur massa congue vel. Proin pulvinar pharetra odio ut efficitur. Pellentesque luctus mauris nunc, eu commodo ex ornare non.\n" +
                "\n" +
                "Maecenas vestibulum fringilla laoreet. Fusce imperdiet sagittis felis sit amet mollis. Sed purus elit, egestas non lectus eu, tincidunt commodo massa. Nullam commodo tincidunt euismod. Pellentesque dui purus, auctor eget est eget, porttitor lobortis nulla. Vivamus at neque tortor. Integer at purus sit amet lectus congue tincidunt eget quis est. Ut tristique nibh ut turpis ultrices, id volutpat nisi blandit. Pellentesque non odio pulvinar dolor pharetra fringilla. Duis sollicitudin, neque in dictum ultrices, turpis sem hendrerit tortor, at imperdiet metus sem eget ex. Donec in mi in tellus efficitur tempor sed sit amet elit. Morbi vitae metus tincidunt, fermentum ipsum sit amet, malesuada augue.\n" +
                "\n" +
                "Cras dictum ante luctus nisl venenatis, in tincidunt eros dignissim. Donec sed massa pulvinar, porta risus ac, interdum nibh. Vestibulum sit amet ultrices velit, vel dapibus nisl. Ut porta malesuada urna, eget aliquam risus aliquet eget. Ut faucibus vestibulum nulla vitae ullamcorper. Nulla dapibus elit et aliquam fermentum. Curabitur venenatis, felis non aliquet finibus, leo leo ullamcorper mauris, ac varius nisi velit vitae dui.\n\n\n\n\n"

    val mockData: List<Note> =
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            listOf(
                Note(
                    "Sed ultrices lectus a dui rhoncus ultrices",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a eros vitae erat accumsan maximus vel non sapien. Donec ante urna, faucibus id lorem vel, lacinia ullamcorper ipsum. Integer suscipit mi at sem lacinia vehicula. Phasellus id tristique ligula, quis rutrum ex. Donec porta convallis metus eget pharetra. Pellentesque orci mi, commodo nec iaculis eget, dapibus sit amet metus. Sed ornare rhoncus posuere. Vestibulum sodales ultrices diam quis hendrerit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Integer non sapien sapien.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Fusce tristique erat tempus",
                    "Proin nulla arcu, ultricies a maximus at, tincidunt vitae dui. Sed congue tempus purus. Curabitur pulvinar accumsan facilisis. Aenean in ligula arcu. Ut nec magna at tellus semper bibendum sed in mi. Duis a lacus sit amet velit efficitur laoreet. Donec mi turpis, gravida porta elementum eget, ullamcorper sit amet nisi.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Vivamus dolor leo",
                    "Vestibulum tempor arcu urna, non ornare tortor consequat ac. Maecenas arcu leo, ultrices commodo fermentum ut, dapibus eget nulla. Fusce porttitor urna ante, nec condimentum sapien pulvinar nec. Aenean lacinia euismod eros vitae vehicula. Nam maximus mi et est fringilla, eu mattis ipsum porta. Pellentesque consequat libero augue, quis ultricies mi consequat at. Praesent id nibh feugiat, vestibulum quam id, lacinia metus. Aliquam erat volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec eget dui tempus, sodales massa vitae, posuere elit. Aenean viverra ligula tristique mauris accumsan rutrum. Cras ultrices maximus ultrices. Phasellus ut commodo ex, et hendrerit magna.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Sed ultrices lectus a dui rhoncus ultrices",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a eros vitae erat accumsan maximus vel non sapien. Donec ante urna, faucibus id lorem vel, lacinia ullamcorper ipsum. Integer suscipit mi at sem lacinia vehicula. Phasellus id tristique ligula, quis rutrum ex. Donec porta convallis metus eget pharetra. Pellentesque orci mi, commodo nec iaculis eget, dapibus sit amet metus. Sed ornare rhoncus posuere. Vestibulum sodales ultrices diam quis hendrerit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Integer non sapien sapien.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Fusce tristique erat tempus",
                    "Proin nulla arcu, ultricies a maximus at, tincidunt vitae dui. Sed congue tempus purus. Curabitur pulvinar accumsan facilisis. Aenean in ligula arcu. Ut nec magna at tellus semper bibendum sed in mi. Duis a lacus sit amet velit efficitur laoreet. Donec mi turpis, gravida porta elementum eget, ullamcorper sit amet nisi.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Vivamus dolor leo",
                    "Vestibulum tempor arcu urna, non ornare tortor consequat ac. Maecenas arcu leo, ultrices commodo fermentum ut, dapibus eget nulla. Fusce porttitor urna ante, nec condimentum sapien pulvinar nec. Aenean lacinia euismod eros vitae vehicula. Nam maximus mi et est fringilla, eu mattis ipsum porta. Pellentesque consequat libero augue, quis ultricies mi consequat at. Praesent id nibh feugiat, vestibulum quam id, lacinia metus. Aliquam erat volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec eget dui tempus, sodales massa vitae, posuere elit. Aenean viverra ligula tristique mauris accumsan rutrum. Cras ultrices maximus ultrices. Phasellus ut commodo ex, et hendrerit magna.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Sed ultrices lectus a dui rhoncus ultrices",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a eros vitae erat accumsan maximus vel non sapien. Donec ante urna, faucibus id lorem vel, lacinia ullamcorper ipsum. Integer suscipit mi at sem lacinia vehicula. Phasellus id tristique ligula, quis rutrum ex. Donec porta convallis metus eget pharetra. Pellentesque orci mi, commodo nec iaculis eget, dapibus sit amet metus. Sed ornare rhoncus posuere. Vestibulum sodales ultrices diam quis hendrerit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Integer non sapien sapien.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Fusce tristique erat tempus",
                    "Proin nulla arcu, ultricies a maximus at, tincidunt vitae dui. Sed congue tempus purus. Curabitur pulvinar accumsan facilisis. Aenean in ligula arcu. Ut nec magna at tellus semper bibendum sed in mi. Duis a lacus sit amet velit efficitur laoreet. Donec mi turpis, gravida porta elementum eget, ullamcorper sit amet nisi.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Vivamus dolor leo",
                    "Vestibulum tempor arcu urna, non ornare tortor consequat ac. Maecenas arcu leo, ultrices commodo fermentum ut, dapibus eget nulla. Fusce porttitor urna ante, nec condimentum sapien pulvinar nec. Aenean lacinia euismod eros vitae vehicula. Nam maximus mi et est fringilla, eu mattis ipsum porta. Pellentesque consequat libero augue, quis ultricies mi consequat at. Praesent id nibh feugiat, vestibulum quam id, lacinia metus. Aliquam erat volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec eget dui tempus, sodales massa vitae, posuere elit. Aenean viverra ligula tristique mauris accumsan rutrum. Cras ultrices maximus ultrices. Phasellus ut commodo ex, et hendrerit magna.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Fusce tristique erat tempus",
                    "Proin nulla arcu, ultricies a maximus at, tincidunt vitae dui. Sed congue tempus purus. Curabitur pulvinar accumsan facilisis. Aenean in ligula arcu. Ut nec magna at tellus semper bibendum sed in mi. Duis a lacus sit amet velit efficitur laoreet. Donec mi turpis, gravida porta elementum eget, ullamcorper sit amet nisi.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Vivamus dolor leo",
                    "Vestibulum tempor arcu urna, non ornare tortor consequat ac. Maecenas arcu leo, ultrices commodo fermentum ut, dapibus eget nulla. Fusce porttitor urna ante, nec condimentum sapien pulvinar nec. Aenean lacinia euismod eros vitae vehicula. Nam maximus mi et est fringilla, eu mattis ipsum porta. Pellentesque consequat libero augue, quis ultricies mi consequat at. Praesent id nibh feugiat, vestibulum quam id, lacinia metus. Aliquam erat volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec eget dui tempus, sodales massa vitae, posuere elit. Aenean viverra ligula tristique mauris accumsan rutrum. Cras ultrices maximus ultrices. Phasellus ut commodo ex, et hendrerit magna.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Sed ultrices lectus a dui rhoncus ultrices",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a eros vitae erat accumsan maximus vel non sapien. Donec ante urna, faucibus id lorem vel, lacinia ullamcorper ipsum. Integer suscipit mi at sem lacinia vehicula. Phasellus id tristique ligula, quis rutrum ex. Donec porta convallis metus eget pharetra. Pellentesque orci mi, commodo nec iaculis eget, dapibus sit amet metus. Sed ornare rhoncus posuere. Vestibulum sodales ultrices diam quis hendrerit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Integer non sapien sapien.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Fusce tristique erat tempus",
                    "Proin nulla arcu, ultricies a maximus at, tincidunt vitae dui. Sed congue tempus purus. Curabitur pulvinar accumsan facilisis. Aenean in ligula arcu. Ut nec magna at tellus semper bibendum sed in mi. Duis a lacus sit amet velit efficitur laoreet. Donec mi turpis, gravida porta elementum eget, ullamcorper sit amet nisi.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Vivamus dolor leo",
                    "Vestibulum tempor arcu urna, non ornare tortor consequat ac. Maecenas arcu leo, ultrices commodo fermentum ut, dapibus eget nulla. Fusce porttitor urna ante, nec condimentum sapien pulvinar nec. Aenean lacinia euismod eros vitae vehicula. Nam maximus mi et est fringilla, eu mattis ipsum porta. Pellentesque consequat libero augue, quis ultricies mi consequat at. Praesent id nibh feugiat, vestibulum quam id, lacinia metus. Aliquam erat volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec eget dui tempus, sodales massa vitae, posuere elit. Aenean viverra ligula tristique mauris accumsan rutrum. Cras ultrices maximus ultrices. Phasellus ut commodo ex, et hendrerit magna.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Vivamus dolor leo",
                    "Vestibulum tempor arcu urna, non ornare tortor consequat ac. Maecenas arcu leo, ultrices commodo fermentum ut, dapibus eget nulla. Fusce porttitor urna ante, nec condimentum sapien pulvinar nec. Aenean lacinia euismod eros vitae vehicula. Nam maximus mi et est fringilla, eu mattis ipsum porta. Pellentesque consequat libero augue, quis ultricies mi consequat at. Praesent id nibh feugiat, vestibulum quam id, lacinia metus. Aliquam erat volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec eget dui tempus, sodales massa vitae, posuere elit. Aenean viverra ligula tristique mauris accumsan rutrum. Cras ultrices maximus ultrices. Phasellus ut commodo ex, et hendrerit magna.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Sed ultrices lectus a dui rhoncus ultrices",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a eros vitae erat accumsan maximus vel non sapien. Donec ante urna, faucibus id lorem vel, lacinia ullamcorper ipsum. Integer suscipit mi at sem lacinia vehicula. Phasellus id tristique ligula, quis rutrum ex. Donec porta convallis metus eget pharetra. Pellentesque orci mi, commodo nec iaculis eget, dapibus sit amet metus. Sed ornare rhoncus posuere. Vestibulum sodales ultrices diam quis hendrerit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Integer non sapien sapien.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Fusce tristique erat tempus",
                    "Proin nulla arcu, ultricies a maximus at, tincidunt vitae dui. Sed congue tempus purus. Curabitur pulvinar accumsan facilisis. Aenean in ligula arcu. Ut nec magna at tellus semper bibendum sed in mi. Duis a lacus sit amet velit efficitur laoreet. Donec mi turpis, gravida porta elementum eget, ullamcorper sit amet nisi.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Vivamus dolor leo",
                    "Vestibulum tempor arcu urna, non ornare tortor consequat ac. Maecenas arcu leo, ultrices commodo fermentum ut, dapibus eget nulla. Fusce porttitor urna ante, nec condimentum sapien pulvinar nec. Aenean lacinia euismod eros vitae vehicula. Nam maximus mi et est fringilla, eu mattis ipsum porta. Pellentesque consequat libero augue, quis ultricies mi consequat at. Praesent id nibh feugiat, vestibulum quam id, lacinia metus. Aliquam erat volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec eget dui tempus, sodales massa vitae, posuere elit. Aenean viverra ligula tristique mauris accumsan rutrum. Cras ultrices maximus ultrices. Phasellus ut commodo ex, et hendrerit magna.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Vivamus dolor leo",
                    "Vestibulum tempor arcu urna, non ornare tortor consequat ac. Maecenas arcu leo, ultrices commodo fermentum ut, dapibus eget nulla. Fusce porttitor urna ante, nec condimentum sapien pulvinar nec. Aenean lacinia euismod eros vitae vehicula. Nam maximus mi et est fringilla, eu mattis ipsum porta. Pellentesque consequat libero augue, quis ultricies mi consequat at. Praesent id nibh feugiat, vestibulum quam id, lacinia metus. Aliquam erat volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec eget dui tempus, sodales massa vitae, posuere elit. Aenean viverra ligula tristique mauris accumsan rutrum. Cras ultrices maximus ultrices. Phasellus ut commodo ex, et hendrerit magna.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Sed ultrices lectus a dui rhoncus ultrices",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a eros vitae erat accumsan maximus vel non sapien. Donec ante urna, faucibus id lorem vel, lacinia ullamcorper ipsum. Integer suscipit mi at sem lacinia vehicula. Phasellus id tristique ligula, quis rutrum ex. Donec porta convallis metus eget pharetra. Pellentesque orci mi, commodo nec iaculis eget, dapibus sit amet metus. Sed ornare rhoncus posuere. Vestibulum sodales ultrices diam quis hendrerit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Integer non sapien sapien.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Fusce tristique erat tempus",
                    "Proin nulla arcu, ultricies a maximus at, tincidunt vitae dui. Sed congue tempus purus. Curabitur pulvinar accumsan facilisis. Aenean in ligula arcu. Ut nec magna at tellus semper bibendum sed in mi. Duis a lacus sit amet velit efficitur laoreet. Donec mi turpis, gravida porta elementum eget, ullamcorper sit amet nisi.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Vivamus dolor leo",
                    "Vestibulum tempor arcu urna, non ornare tortor consequat ac. Maecenas arcu leo, ultrices commodo fermentum ut, dapibus eget nulla. Fusce porttitor urna ante, nec condimentum sapien pulvinar nec. Aenean lacinia euismod eros vitae vehicula. Nam maximus mi et est fringilla, eu mattis ipsum porta. Pellentesque consequat libero augue, quis ultricies mi consequat at. Praesent id nibh feugiat, vestibulum quam id, lacinia metus. Aliquam erat volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec eget dui tempus, sodales massa vitae, posuere elit. Aenean viverra ligula tristique mauris accumsan rutrum. Cras ultrices maximus ultrices. Phasellus ut commodo ex, et hendrerit magna.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Vivamus dolor leo",
                    "Vestibulum tempor arcu urna, non ornare tortor consequat ac. Maecenas arcu leo, ultrices commodo fermentum ut, dapibus eget nulla. Fusce porttitor urna ante, nec condimentum sapien pulvinar nec. Aenean lacinia euismod eros vitae vehicula. Nam maximus mi et est fringilla, eu mattis ipsum porta. Pellentesque consequat libero augue, quis ultricies mi consequat at. Praesent id nibh feugiat, vestibulum quam id, lacinia metus. Aliquam erat volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec eget dui tempus, sodales massa vitae, posuere elit. Aenean viverra ligula tristique mauris accumsan rutrum. Cras ultrices maximus ultrices. Phasellus ut commodo ex, et hendrerit magna.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Sed ultrices lectus a dui rhoncus ultrices",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce a eros vitae erat accumsan maximus vel non sapien. Donec ante urna, faucibus id lorem vel, lacinia ullamcorper ipsum. Integer suscipit mi at sem lacinia vehicula. Phasellus id tristique ligula, quis rutrum ex. Donec porta convallis metus eget pharetra. Pellentesque orci mi, commodo nec iaculis eget, dapibus sit amet metus. Sed ornare rhoncus posuere. Vestibulum sodales ultrices diam quis hendrerit. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Integer non sapien sapien.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Fusce tristique erat tempus",
                    "Proin nulla arcu, ultricies a maximus at, tincidunt vitae dui. Sed congue tempus purus. Curabitur pulvinar accumsan facilisis. Aenean in ligula arcu. Ut nec magna at tellus semper bibendum sed in mi. Duis a lacus sit amet velit efficitur laoreet. Donec mi turpis, gravida porta elementum eget, ullamcorper sit amet nisi.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                ),
                Note(
                    "Vivamus dolor leo",
                    "Vestibulum tempor arcu urna, non ornare tortor consequat ac. Maecenas arcu leo, ultrices commodo fermentum ut, dapibus eget nulla. Fusce porttitor urna ante, nec condimentum sapien pulvinar nec. Aenean lacinia euismod eros vitae vehicula. Nam maximus mi et est fringilla, eu mattis ipsum porta. Pellentesque consequat libero augue, quis ultricies mi consequat at. Praesent id nibh feugiat, vestibulum quam id, lacinia metus. Aliquam erat volutpat. Interdum et malesuada fames ac ante ipsum primis in faucibus. Donec eget dui tempus, sodales massa vitae, posuere elit. Aenean viverra ligula tristique mauris accumsan rutrum. Cras ultrices maximus ultrices. Phasellus ut commodo ex, et hendrerit magna.",
                    LocalDate.of(2022, 1, 1),
                    LocalDate.of(2022, 1, 1)
                )
            )
        } else {
            TODO("VERSION.SDK_INT < O")
        }
}