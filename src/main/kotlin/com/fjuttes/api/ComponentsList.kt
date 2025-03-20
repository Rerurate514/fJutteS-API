package com.fjuttes.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class Component(
    val name: String,
    val summary: String,
    val exCode: String,
    val properties: Map<String, Any>
)

val accordion = Component(
    name = "Accordion",
    summary = "Displays multiple collapsible sections. Each section can be expanded or collapsed by clicking its header, ideal for organizing large amounts of information.",
    exCode = "new Accordion({\n" +
            "        items: [{\n" +
            "            title: \"Section 1\",\n" +
            "            content: new Text(\"Content of section 1\")\n" +
            "        }, {\n" +
            "            title: \"Section 2\",\n" +
            "            content: new Text(\"Content of section 2\")\n" +
            "        }]\n" +
            "    })",
    properties = mapOf(
        "items" to mapOf(
            "type" to "Array<{title: string, content: Component}>",
            "description" to "An array of accordion items, each with a title and content."
        ),
        "radius" to mapOf(
            "type" to "string",
            "description" to "The border radius of the accordion (e.g., '8px')."
        ),
        "shadowLevel" to mapOf(
            "type" to "ShadowLevel",
            "description" to "The shadow level of the accordion."
        ),
        "baseCSS" to mapOf(
            "type" to "BaseCSS",
            "description" to "The base CSS styles for the accordion."
        )
    )
)

// Boxコンポーネント
val box = Component(
    name = "Box",
    summary = "A basic container for wrapping content. Offers customizable width, height, background color, border, and WebkitCSS styles. Versatile layout element.",
    exCode = "new Box({\n" +
            "    width: \"200px\",\n" +
            "    height: \"100px\",\n" +
            "    background: \"lightgray\",\n" +
            "    child: new Text(\"This is a box\")\n" +
            "})",
    properties = mapOf(
        "width" to mapOf(
            "type" to "string",
            "description" to "The width of the box (e.g., '200px', '100%')."
        ),
        "height" to mapOf(
            "type" to "string",
            "description" to "The height of the box (e.g., '100px', 'auto')."
        ),
        "background" to mapOf(
            "type" to "string",
            "description" to "The background color or style of the box."
        ),
        "child" to mapOf(
            "type" to "Component",
            "description" to "The content to be displayed inside the box."
        )
    )
)

// Cardコンポーネント
val card = Component(
    name = "Card",
    summary = "Presents information in a card format with customizable corner radius, background color, elevation (shadow), and WebkitCSS. Visually groups information effectively.",
    exCode = "new Card({\n" +
            "    child: new Text(\"This is a card\"),\n" +
            "    elevation: ShadowLevel.LVL2,\n" +
            "    baseCSS: new BaseCSS({\n" +
            "        padding: \"16px\"\n" +
            "    }),\n" +
            "    radius: \"8px\"\n" +
            "})",
    properties = mapOf(
        "child" to mapOf(
            "type" to "Component",
            "description" to "The content to be displayed inside the card."
        ),
        "elevation" to mapOf(
            "type" to "ShadowLevel",
            "description" to "The shadow level of the card."
        ),
        "baseCSS" to mapOf(
            "type" to "BaseCSS",
            "description" to "The base CSS styles for the card."
        ),
        "radius" to mapOf(
            "type" to "string",
            "description" to "The border radius of the card (e.g., '8px')."
        )
    )
)

// Centerコンポーネント
val center = Component(
    name = "Center",
    summary = "Horizontally and vertically centers child elements, ensuring they are always positioned in the middle, regardless of size. Supports responsive design.",
    exCode = "new Box({\n" +
            "    width: \"200px\",\n" +
            "    height: \"100px\",\n" +
            "    background: \"lightgray\",\n" +
            "    child: new Center(\n" +
            "        new Text(\"Centered Text\")\n" +
            "    )\n" +
            "})",
    properties = mapOf(
        "child" to mapOf(
            "type" to "Component",
            "description" to "The element to be centered."
        )
    )
)

// Chipsコンポーネント
val chips = Component(
    name = "Chips",
    summary = "Displays small labels or pieces of information, suitable for tags, categories, or statuses. Offers customizable styling options.",
    exCode = "new Chips({\n" +
            "    text: \"Chiped Text\"\n" +
            "})",
    properties = mapOf(
        "text" to mapOf(
            "type" to "string",
            "description" to "The text to be displayed in the chip."
        )
    )
)

// Clipコンポーネント
val clip = Component(
    name = "Clip",
    summary = "Wraps content and clips it to a specified shape or area, useful for cropping images or videos.",
    exCode = "new Clip({\n" +
            "    child: new Image({\n" +
            "        src: LOGO_URL,\n" +
            "        baseCSS: new BaseCSS({\n" +
            "            width: \"64px\"\n" +
            "        })\n" +
            "    })\n" +
            "})",
    properties = mapOf(
        "child" to mapOf(
            "type" to "Component",
            "description" to "The content to be clipped."
        )
    )
)

// CodeBlockコンポーネント
val codeBlock = Component(
    name = "CodeBlock",
    summary = "Displays code blocks with syntax highlighting and line numbering, ideal for showcasing programming code snippets.",
    exCode = "new CodeBlock({\n" +
            "    code: codeExampleString,\n" +
            "    language: 'js',\n" +
            "    showLineNumbers: true,\n" +
            "})",
    properties = mapOf(
        "code" to mapOf(
            "type" to "string",
            "description" to "The code content to be displayed."
        ),
        "language" to mapOf(
            "type" to "string",
            "description" to "The programming language for syntax highlighting."
        ),
        "showLineNumbers" to mapOf(
            "type" to "boolean",
            "description" to "Whether to show line numbers."
        )
    )
)

// Columnコンポーネント
val column = Component(
    name = "Column",
    summary = "A container for vertical layouts, arranging child elements in a top-to-bottom order. Supports horizontal centering for responsive column layouts.",
    exCode = "new Column({\n" +
            "    children: [new Text(\"Item 1\"), new Text(\"Item 2\"), new Text(\"Item 3\")]\n" +
            "})",
    properties = mapOf(
        "children" to mapOf(
            "type" to "Array<Component>",
            "description" to "The child elements to be arranged vertically."
        )
    )
)

// DropDownMenuコンポーネント
val dropDownMenu = Component(
    name = "DropDownMenu",
    summary = "Presents a list of selectable options in a dropdown format, commonly used in forms or navigation menus.",
    exCode = "new DropDownMenu({\n" +
            "    item: [\n" +
            "        new DropDownMenuItem({ text: \"Option 1\", value: \"1\" }),\n" +
            "        new DropDownMenuItem({ text: \"Option 2\", value: \"2\" }),\n" +
            "        new DropDownMenuItem({ text: \"Option 3\", value: \"3\" })\n" +
            "    ],\n" +
            "    provider: myProvider\n" +
            "})",
    properties = mapOf(
        "item" to mapOf(
            "type" to "Array<DropDownMenuItem>",
            "description" to "The list of dropdown menu items."
        ),
        "provider" to mapOf(
            "type" to "Provider",
            "description" to "The provider for managing the selected value."
        )
    )
)

// ElevatedButtonコンポーネント
val elevatedButton = Component(
    name = "ElevatedButton",
    summary = "An interactive button with a visual elevation effect, providing feedback upon click. Used for actions and form submissions.",
    exCode = "new ElevatedButton({\n" +
            "    baseCSS: new BaseCSS({\n" +
            "        padding: \"16px\"\n" +
            "    }),\n" +
            "    child: new Text(\"Click Me\"),\n" +
            "    onClick: () => console.log(\"Button clicked\")\n" +
            "})",
    properties = mapOf(
        "child" to mapOf(
            "type" to "Component",
            "description" to "The content to be displayed inside the button."
        ),
        "onClick" to mapOf(
            "type" to "Function",
            "description" to "The callback function when the button is clicked."
        )
    )
)

// ExpandsPanelコンポーネント
val expandsPanel = Component(
    name = "ExpandsPanel",
    summary = "A panel that can expand or collapse to show or hide detailed information, ideal for FAQs and settings screens.",
    exCode = "new ExpandsPanel({\n" +
            "    titleItem: new Text(\"Details\"),\n" +
            "    child: new Text(\"Detailed information here\")\n" +
            "})",
    properties = mapOf(
        "titleItem" to mapOf(
            "type" to "Component",
            "description" to "The title element that toggles the expansion."
        ),
        "child" to mapOf(
            "type" to "Component",
            "description" to "The content to be shown/hidden."
        )
    )
)

// FloatingActionButtonコンポーネント
val floatingActionButton = Component(
    name = "FloatingActionButton",
    summary = "A circular action button fixed at the bottom of the screen, providing constant access to primary actions, commonly used in mobile apps.",
    exCode = "new FloatingActionButton({\n" +
            "    onClick: () => console.log(\"FAB clicked\")\n" +
            "})",
    properties = mapOf(
        "onClick" to mapOf(
            "type" to "Function",
            "description" to "The callback function when the button is clicked."
        )
    )
)

// Gridコンポーネント
val grid = Component(
    name = "Grid",
    summary = "A container for grid layouts, arranging child elements in a grid pattern to create complex layouts. Supports responsive grids.",
    exCode = "new Grid({\n" +
            "    minmaxPX: 50,\n" +
            "    children: [\n" +
            "        new Box({\n" +
            "            width: \"50px\",\n" +
            "            height: \"50px\",\n" +
            "            background: \"green\"\n" +
            "        }),\n" +
            "        new Box({\n" +
            "            width: \"50px\",\n" +
            "            height: \"50px\",\n" +
            "            background: \"lightgreen\"\n" +
            "        })\n" +
            "    ]\n" +
            "})",
    properties = mapOf(
        "minmaxPX" to mapOf(
            "type" to "number",
            "description" to "The minimum and maximum size of grid items in pixels."
        ),
        "children" to mapOf(
            "type" to "Array<Component>",
            "description" to "The child elements to be arranged in the grid."
        )
    )
)

// Headerコンポーネント
val header = Component(
    name = "Header",
    summary = "Represents the header of a page or section, containing titles and navigation elements to clarify page structure.",
    exCode = "new Header({\n" +
            "    title: \"Page Title\",\n" +
            "    navigation: [new Link({\n" +
            "        href: \"/home\",\n" +
            "        child: new Text(\"Home\")\n" +
            "    })]\n" +
            "})",
    properties = mapOf(
        "title" to mapOf(
            "type" to "string",
            "description" to "The main title text."
        ),
        "navigation" to mapOf(
            "type" to "Array<Link>",
            "description" to "The navigation links to be displayed."
        )
    )
)

// Hoverコンポーネント
val hover = Component(
    name = "Hover",
    summary = "Applies effects when the mouse hovers over child elements, enhancing UI interactivity.",
    exCode = "new Hover({\n" +
            "    child: new Text(\"Hover Me\")\n" +
            "})",
    properties = mapOf(
        "child" to mapOf(
            "type" to "Component",
            "description" to "The element that responds to hover."
        )
    )
)

// Imageコンポーネント
val image = Component(
    name = "Image",
    summary = "A wrapper for displaying images with customizable source, alt text, title, and styles. Supports responsive images.",
    exCode = "new Image({\n" +
            "    src: \"image.jpg\",\n" +
            "    alt: \"Example Image\"\n" +
            "})",
    properties = mapOf(
        "src" to mapOf(
            "type" to "string",
            "description" to "The source URL of the image."
        ),
        "alt" to mapOf(
            "type" to "string",
            "description" to "The alternative text for accessibility."
        )
    )
)

// LimitedProviderScopeコンポーネント
val limitedProviderScope = Component(
    name = "LimitedProviderScope",
    summary = "A wrapper that limits the scope of providers, allowing their values to be used only within a specific area. Useful for localizing state management.",
    exCode = "new LimitedProviderScope({\n" +
            "    watchingProviders: [myProvider],\n" +
            "    build: (value) => {\n" +
            "        return new Text(value)\n" +
            "    }\n" +
            "})",
    properties = mapOf(
        "watchingProviders" to mapOf(
            "type" to "Array<Provider>",
            "description" to "The providers whose values should be watched."
        ),
        "build" to mapOf(
            "type" to "Function",
            "description" to "The function that builds the content based on provider values."
        )
    )
)

// Linkコンポーネント
val link = Component(
    name = "Link",
    summary = "Represents clickable links for navigating to external sites or within the page, with options for download and target attributes.",
    exCode = "new Link({\n" +
            "    href: \"https://example.com\",\n" +
            "    child: new Text(\"Visit Example\")\n" +
            "})",
    properties = mapOf(
        "href" to mapOf(
            "type" to "string",
            "description" to "The URL to navigate to when clicked."
        ),
        "child" to mapOf(
            "type" to "Component",
            "description" to "The content to be displayed as the link."
        ),
        "target" to mapOf(
            "type" to "string",
            "description" to "The target attribute for the link (e.g., '_blank')."
        ),
        "download" to mapOf(
            "type" to "boolean",
            "description" to "Whether the link should trigger a file download."
        )
    )
)

// Marginコンポーネント
val margin = Component(
    name = "Margin",
    summary = "Applies margins to child elements, adjusting spacing for better layout. Supports responsive margin settings.",
    exCode = "new Margin({\n" +
            "    child: new Text(\"Margin Applied\"),\n" +
            "    all: \"10px\"\n" +
            "})",
    properties = mapOf(
        "child" to mapOf(
            "type" to "Component",
            "description" to "The element to which margins will be applied."
        ),
        "all" to mapOf(
            "type" to "string",
            "description" to "Uniform margin on all sides (e.g., '10px')."
        ),
        "top" to mapOf(
            "type" to "string",
            "description" to "Margin for the top side (e.g., '10px')."
        ),
        "right" to mapOf(
            "type" to "string",
            "description" to "Margin for the right side (e.g., '10px')."
        ),
        "bottom" to mapOf(
            "type" to "string",
            "description" to "Margin for the bottom side (e.g., '10px')."
        ),
        "left" to mapOf(
            "type" to "string",
            "description" to "Margin for the left side (e.g., '10px')."
        )
    )
)

// Paddingコンポーネント
val padding = Component(
    name = "Padding",
    summary = "Applies padding to child elements, adjusting internal spacing for better content presentation. Supports responsive padding settings.",
    exCode = "new Padding({\n" +
            "    child: new Text(\"Padding Applied\"),\n" +
            "    all: \"20px\"\n" +
            "})",
    properties = mapOf(
        "child" to mapOf(
            "type" to "Component",
            "description" to "The element to which padding will be applied."
        ),
        "all" to mapOf(
            "type" to "string",
            "description" to "Uniform padding on all sides (e.g., '20px')."
        ),
        "top" to mapOf(
            "type" to "string",
            "description" to "Padding for the top side (e.g., '20px')."
        ),
        "right" to mapOf(
            "type" to "string",
            "description" to "Padding for the right side (e.g., '20px')."
        ),
        "bottom" to mapOf(
            "type" to "string",
            "description" to "Padding for the bottom side (e.g., '20px')."
        ),
        "left" to mapOf(
            "type" to "string",
            "description" to "Padding for the left side (e.g., '20px')."
        )
    )
)

// PageRouterコンポーネント
val pageRouter = Component(
    name = "PageRouter",
    summary = "Manages page transitions in single-page applications (SPAs).",
    exCode = "new PageRouter({\n" +
            "    pages: [HomePage, AboutPage]\n" +
            "})",
    properties = mapOf(
        "pages" to mapOf(
            "type" to "Array<Component>",
            "description" to "The pages to be managed by the router."
        )
    )
)

// Paginationsコンポーネント
val paginations = Component(
    name = "Paginations",
    summary = "Provides pagination functionality, dividing large datasets into pages for easy navigation in tables or lists.",
    exCode = "new Paginations({\n" +
            "    currentPage: 1,\n" +
            "    totalPages: 10,\n" +
            "    onPageChange: (page) => console.log(page)\n" +
            "})",
    properties = mapOf(
        "currentPage" to mapOf(
            "type" to "number",
            "description" to "The currently active page number."
        ),
        "totalPages" to mapOf(
            "type" to "number",
            "description" to "The total number of pages available."
        ),
        "onPageChange" to mapOf(
            "type" to "Function",
            "description" to "Callback function when page changes."
        )
    )
)

// Positionコンポーネント
val position = Component(
    name = "Position",
    summary = "Controls the position of child elements using absolute or relative positioning, enabling complex layouts and overlays.",
    exCode = "new Position({\n" +
            "    child: new Text(\"Positioned Text\"),\n" +
            "    top: 50,\n" +
            "    left: 50\n" +
            "})",
    properties = mapOf(
        "child" to mapOf(
            "type" to "Component",
            "description" to "The element to be positioned."
        ),
        "top" to mapOf(
            "type" to "number",
            "description" to "The distance from the top (e.g., 50)."
        ),
        "right" to mapOf(
            "type" to "number",
            "description" to "The distance from the right (e.g., 50)."
        ),
        "bottom" to mapOf(
            "type" to "number",
            "description" to "The distance from the bottom (e.g., 50)."
        ),
        "left" to mapOf(
            "type" to "number",
            "description" to "The distance from the left (e.g., 50)."
        )
    )
)

// RadioButtonコンポーネント
val radioButton = Component(
    name = "RadioButton",
    summary = "A group of mutually exclusive options, allowing users to select only one option in forms.",
    exCode = "new RadioButton({\n" +
            "    labelText: \"Option A\",\n" +
            "    name: \"radio-group\",\n" +
            "    checkedRadioButton: (e, r) => { console.log(e, r); }\n" +
            "})",
    properties = mapOf(
        "labelText" to mapOf(
            "type" to "string",
            "description" to "The text to be displayed next to the radio button."
        ),
        "name" to mapOf(
            "type" to "string",
            "description" to "The group name for the radio buttons."
        ),
        "checkedRadioButton" to mapOf(
            "type" to "Function",
            "description" to "Callback function when radio button is selected."
        )
    )
)

// RelativePositionコンポーネント
val relativePosition = Component(
    name = "RelativePosition",
    summary = "Defines relative positioning based on the parent element, enhancing layout flexibility.",
    exCode = "new RelativePosition({\n" +
            "    child: new Text(\"Relative Text\"),\n" +
            "    relativePositions: RelativePositions.RIGHT\n" +
            "})",
    properties = mapOf(
        "child" to mapOf(
            "type" to "Component",
            "description" to "The element to be positioned relatively."
        ),
        "relativePositions" to mapOf(
            "type" to "RelativePositions",
            "description" to "The relative position to the parent."
        )
    )
)

// Rowコンポーネント
val row = Component(
    name = "Row",
    summary = "A container for horizontal layouts, arranging child elements in a left-to-right order. Supports centering and space distribution for responsive row layouts.",
    exCode = "new Row({\n" +
            "    children: [new Text(\"Item A\"), new Text(\"Item B\"), new Text(\"Item C\")]\n" +
            "})",
    properties = mapOf(
        "children" to mapOf(
            "type" to "Array<Component>",
            "description" to "The child elements to be arranged horizontally."
        )
    )
)

// Scaffoldコンポーネント
val scaffold = Component(
    name = "Scaffold",
    summary = "Provides a basic page structure with headers, footers, and sidebars, ensuring consistent page layouts.",
    exCode = "new Scaffold({\n" +
            "    header: new Header({\n" +
            "        title: \"App\"\n" +
            "    }),\n" +
            "    body: new Text(\"Main Content\"),\n" +
            "    footer: new Text(\"Footer\")\n" +
            "})",
    properties = mapOf(
        "header" to mapOf(
            "type" to "Component",
            "description" to "The header section of the page."
        ),
        "body" to mapOf(
            "type" to "Component",
            "description" to "The main content section."
        ),
        "footer" to mapOf(
            "type" to "Component",
            "description" to "The footer section."
        )
    )
)

// Shrinkコンポーネント
val shrink = Component(
    name = "Shrink",
    summary = "Automatically shrinks child elements to fit within the parent container, useful for responsive layouts.",
    exCode = "new Shrink({\n" +
            "    child: new Text(\"Long Text That Shrinks\")\n" +
            "})",
    properties = mapOf(
        "child" to mapOf(
            "type" to "Component",
            "description" to "The element to be shrunk."
        )
    )
)

// SimpleDialogコンポーネント
val simpleDialog = Component(
    name = "SimpleDialog",
    summary = "Displays modal dialogs for important information or choices, such as alerts and confirmations.",
    exCode = "new SimpleDialog({\n" +
            "    child: new Text(\"Are you sure?\"),\n" +
            "    onOkClickedFn: () => console.log(\"Yes\"),\n" +
            "    onCancelClickedFn: () => console.log(\"No\")\n" +
            "}).openModal()",
    properties = mapOf(
        "child" to mapOf(
            "type" to "Component",
            "description" to "The content to be displayed in the dialog."
        ),
        "onOkClickedFn" to mapOf(
            "type" to "Function",
            "description" to "Callback function when OK is clicked."
        ),
        "onCancelClickedFn" to mapOf(
            "type" to "Function",
            "description" to "Callback function when Cancel is clicked."
        )
    )
)

// Sliderコンポーネント
val slider = Component(
    name = "Slider",
    summary = "Allows users to select values within a range by sliding, commonly used in forms and settings screens.",
    exCode = "new Slider({\n" +
            "    value: 50,\n" +
            "    provider: myProvider\n" +
            "})",
    properties = mapOf(
        "value" to mapOf(
            "type" to "number",
            "description" to "The current value of the slider."
        ),
        "provider" to mapOf(
            "type" to "Provider",
            "description" to "The provider for managing the slider value."
        )
    )
)

// SpaceBoxコンポーネント
val spaceBox = Component(
    name = "SpaceBox",
    summary = "Inserts fixed-size spaces between child elements, adjusting layout spacing.",
    exCode = "new SpaceBox({\n" +
            "    width: \"20px\",\n" +
            "    height: \"20px\"\n" +
            "})",
    properties = mapOf(
        "width" to mapOf(
            "type" to "string",
            "description" to "The width of the space (e.g., '20px')."
        ),
        "height" to mapOf(
            "type" to "string",
            "description" to "The height of the space (e.g., '20px')."
        )
    )
)

// Stackコンポーネント
val stack = Component(
    name = "Stack",
    summary = "Arranges child elements in a stacked manner, creating layered structures for overlapping images or text.",
    exCode = "new Stack({\n" +
            "    baseCSS: new BaseCSS({\n" +
            "        width: \"100px\",\n" +
            "        height: \"100px\"\n" +
            "    }),\n" +
            "    children: [new Box({\n" +
            "        width: \"100px\",\n" +
            "        height: \"100px\",\n" +
            "        background: \"red\"\n" +
            "    }), new Text(\"Stacked Text\")]\n" +
            "})",
    properties = mapOf(
        "children" to mapOf(
            "type" to "Array<Component>",
            "description" to "The elements to be stacked."
        )
    )
)

// Textコンポーネント
val text = Component(
    name = "Text",
    summary = "A wrapper for styling text with customizable font, color, size, and styles. Supports WebkitCSS.",
    exCode = "new Text(\"Example Text\", new TextCSS({\n" +
            "    fontCSS: new FontCSS({\n" +
            "        color: \"blue\"\n" +
            "    })\n" +
            "}))",
    properties = mapOf(
        "text" to mapOf(
            "type" to "string",
            "description" to "The text content to be displayed."
        ),
        "textCSS" to mapOf(
            "type" to "TextCSS",
            "description" to "The styling configuration for the text."
        )
    )
)

// TextAreaコンポーネント
val textArea = Component(
    name = "TextArea",
    summary = "Enables multi-line text input in forms, supporting text wrapping and scrolling.",
    exCode = "new TextArea({\n" +
            "    placeholder: \"Enter text here\",\n" +
            "    rows: 2,\n" +
            "    cols: 2,\n" +
            "    provider: myProvider\n" +
            "})",
    properties = mapOf(
        "placeholder" to mapOf(
            "type" to "string",
            "description" to "The text shown when no input is provided."
        ),
        "rows" to mapOf(
            "type" to "number",
            "description" to "The number of visible text rows."
        ),
        "cols" to mapOf(
            "type" to "number",
            "description" to "The number of visible text columns."
        ),
        "provider" to mapOf(
            "type" to "Provider",
            "description" to "The provider for managing the text input."
        )
    )
)

// TextFormコンポーネント
val textForm = Component(
    name = "TextForm",
    summary = "Provides text input fields for forms with labeling and placeholder support, facilitating text input, editing, and validation.",
    exCode = "new TextForm({\n" +
            "    placeholder: \"Your Name\",\n" +
            "    maxLength: 50,\n" +
            "    provider: myProvider\n" +
            "})",
    properties = mapOf(
        "placeholder" to mapOf(
            "type" to "string",
            "description" to "The text shown when no input is provided."
        ),
        "maxLength" to mapOf(
            "type" to "number",
            "description" to "The maximum number of characters allowed."
        ),
        "provider" to mapOf(
            "type" to "Provider",
            "description" to "The provider for managing the text input."
        )
    )
)

// Transformコンポーネント
val transform = Component(
    name = "Transform",
    summary = "Applies 2D or 3D transformations to HTML elements. Uses the CSS transform property for operations like move, rotate, scale, and skew. Supports animation for smooth visual effects.",
    exCode = "new Transform({\n" +
            "    child: new Text(\"Transform Sample\"),\n" +
            "    baseCSS: new BaseCSS({\n" +
            "        background: \"#eee\",\n" +
            "        padding: \"20px\",\n" +
            "        width: \"200px\",\n" +
            "        textAlign: \"center\",\n" +
            "    }),\n" +
            "}).animate(\n" +
            "    { \n" +
            "        translateY: 5,\n" +
            "        rotateZ: 90\n" +
            "    },\n" +
            "    1000,\n" +
            "    \"ease-in-out\"\n" +
            ")",    properties = mapOf(
        "child" to mapOf(
            "type" to "Component",
            "description" to "The element to be transformed."
        ),
        "baseCSS" to mapOf(
            "type" to "BaseCSS",
            "description" to "The base CSS styles for the transform container."
        ),
        "transform" to mapOf(
            "type" to "string",
            "description" to "The CSS transform property value (e.g., 'translateY(5px) rotate(90deg)')."
        )
    )
)

// RelativePositionAnimateSwitcherコンポーネント
val relativePositionAnimateSwitcher = Component(
    name = "RelativePositionAnimateSwitcher",
    summary = "Switches the relative position of child components with animation.",
    exCode = "new Column({\n" +
            "    baseCSS: new BaseCSS({\n" +
            "        padding: \"16px\"\n" +
            "    }),\n" +
            "    children: [\n" +
            "        switcher,\n" +
            "        new SpaceBox({\n" +
            "            height: \"16px\"\n" +
            "        }),\n" +
            "        new ElevatedButton({\n" +
            "            radius: \"8px\",\n" +
            "            baseCSS: new BaseCSS({\n" +
            "                padding: \"16px\"\n" +
            "            }),\n" +
            "            child: new Text(\"animate\"),\n" +
            "            onClick: () => {\n" +
            "                switcher.animate();\n" +
            "            }\n" +
            "        })\n" +
            "    ]\n" +
            "})",    properties = mapOf(
        "children" to mapOf(
            "type" to "Array<Component>",
            "description" to "The elements to be animated."
        )
    )
)

// LangSwitcherコンポーネント
val langSwitcher = Component(
    name = "LangSwitcher",
    summary = "Provides language switching functionality and rebuilds specified components in response to changes in language status.",
    exCode = "new Column({\n" +
            "    children: [\n" +
            "        new Center(\n" +
            "            new LangSwitcher({\n" +
            "                build: (lang) => {\n" +
            "                    if (lang[0] === \"ja\") {\n" +
            "                        return new Text(\"こんにちは\");\n" +
            "                    } else {\n" +
            "                        return new Text(\"Hello\");\n" +
            "                    }\n" +
            "                },\n" +
            "            }),\n" +
            "        ),\n" +
            "        new SpaceBox({\n" +
            "            height: \"16px\"\n" +
            "        }),\n" +
            "        new Row({\n" +
            "            children: [\n" +
            "                new ElevatedButton({\n" +
            "                    radius: \"8px\",\n" +
            "                    baseCSS: new BaseCSS({\n" +
            "                        padding: \"16px\"\n" +
            "                    }),\n" +
            "                    child: new Text(\"to en\"),\n" +
            "                    onClick: () => {\n" +
            "                        langSwitchProvider.update(() => \"en\");\n" +
            "                    }\n" +
            "                }),\n" +
            "                new SpaceBox({\n" +
            "                    width: \"16px\"\n" +
            "                }),\n" +
            "                new ElevatedButton({\n" +
            "                    radius: \"8px\",\n" +
            "                    baseCSS: new BaseCSS({\n" +
            "                        padding: \"16px\"\n" +
            "                    }),\n" +
            "                    child: new Text(\"to ja\"),\n" +
            "                    onClick: () => {\n" +
            "                        langSwitchProvider.update(() => \"ja\");\n" +
            "                    }\n" +
            "                })\n" +
            "            ]\n" +
            "        })\n" +
            "    ]\n" +
            "})",    properties = mapOf(
        "build" to mapOf(
            "type" to "Function",
            "description" to "The function that builds the content based on language."
        )
    )
)

@RestController
@RequestMapping("/components")
class ComponentsListController {
    @GetMapping("")
    fun getComponentsList(): List<Component> {
        return listOf(
            accordion,
            box,
            card,
            center,
            chips,
            clip,
            codeBlock,
            column,
            dropDownMenu,
            elevatedButton,
            expandsPanel,
            floatingActionButton,
            grid,
            header,
            hover,
            image,
            limitedProviderScope,
            link,
            margin,
            padding,
            pageRouter,
            paginations,
            position,
            radioButton,
            relativePosition,
            row,
            scaffold,
            shrink,
            simpleDialog,
            slider,
            spaceBox,
            stack,
            text,
            textArea,
            textForm,
            transform,
            relativePositionAnimateSwitcher,
            langSwitcher
        )
    }
}
